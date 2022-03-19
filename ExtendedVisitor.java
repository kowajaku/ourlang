package main;

import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;

import gen.ourlangBaseVisitor;
import gen.ourlangLexer;
import gen.ourlangParser;

import gen.ourlangParser.*;

public class ExtendedVisitor extends ourlangBaseVisitor<ourlangValue> {
    private static ReturnValue returnValue = new ReturnValue();
    private Scope scope;

    ExtendedVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public ourlangValue visitMinExpr(ourlangParser.MinExprContext ctx) {
        ourlangValue v = this.visit(ctx.expression());
        return new ourlangValue(-1 * v.asDouble());
    }

    @Override
    public ourlangValue visitMulExpr(ourlangParser.MulExprContext ctx) {
        if (ctx.op.getType()==ourlangLexer.MUL)
            return multiply(ctx);
        else
            return divide(ctx);
    }

    @Override
    public ourlangValue visitAddExpr(ourlangParser.AddExprContext ctx) {
        if (ctx.op.getType()==ourlangLexer.ADD)
            return add(ctx);
        else
            return subtract(ctx);
    }

    @Override
    public ourlangValue visitCmpExpr(ourlangParser.CmpExprContext ctx) {
        if (ctx.op.getType()==ourlangLexer.LR)
            return lr(ctx);
        if (ctx.op.getType()==ourlangLexer.LRE)
            return lre(ctx);
        if (ctx.op.getType()==ourlangLexer.GR)
            return gr(ctx);
        else
            return gre(ctx);
    }

    @Override
    public ourlangValue visitEqExpr(ourlangParser.EqExprContext ctx) {
        if (ctx.op.getType()==ourlangLexer.EQ)
            return eq(ctx);
        else
            return neq(ctx);
    }

    public ourlangValue multiply(MulExprContext ctx) {
        ourlangValue lhs = this.visit(ctx.expression(0));
        ourlangValue rhs = this.visit(ctx.expression(1));
        return new ourlangValue(lhs.asDouble() * rhs.asDouble());
    }

    private ourlangValue divide(MulExprContext ctx) {
        ourlangValue lhs = this.visit(ctx.expression(0));
        ourlangValue rhs = this.visit(ctx.expression(1));
        return new ourlangValue(lhs.asDouble() / rhs.asDouble());
    }

    private ourlangValue add(AddExprContext ctx) {
        ourlangValue lhs = this.visit(ctx.expression(0));
        ourlangValue rhs = this.visit(ctx.expression(1));
        return new ourlangValue(lhs.asDouble() + rhs.asDouble());
    }

    private ourlangValue subtract(AddExprContext ctx) {
        ourlangValue lhs = this.visit(ctx.expression(0));
        ourlangValue rhs = this.visit(ctx.expression(1));
        return new ourlangValue(lhs.asDouble() - rhs.asDouble());
    }

    private ourlangValue gre(CmpExprContext ctx) {
        ourlangValue lhs = this.visit(ctx.expression(0));
        ourlangValue rhs = this.visit(ctx.expression(1));
        return new ourlangValue(lhs.asDouble() >= rhs.asDouble());
    }

    private ourlangValue lre(CmpExprContext ctx) {
        ourlangValue lhs = this.visit(ctx.expression(0));
        ourlangValue rhs = this.visit(ctx.expression(1));
        return new ourlangValue(lhs.asDouble() <= rhs.asDouble());
    }

    private ourlangValue gr(CmpExprContext ctx) {
        ourlangValue lhs = this.visit(ctx.expression(0));
        ourlangValue rhs = this.visit(ctx.expression(1));
        return new ourlangValue(lhs.asDouble() > rhs.asDouble());
    }

    private ourlangValue lr(CmpExprContext ctx) {
        ourlangValue lhs = this.visit(ctx.expression(0));
        ourlangValue rhs = this.visit(ctx.expression(1));
        return new ourlangValue(lhs.asDouble() < rhs.asDouble());
    }

    private ourlangValue eq(EqExprContext ctx) {
        ourlangValue lhs = this.visit(ctx.expression(0));
        ourlangValue rhs = this.visit(ctx.expression(1));
        return new ourlangValue(lhs.equals(rhs));
    }

    private ourlangValue neq(EqExprContext ctx) {
        ourlangValue lhs = this.visit(ctx.expression(0));
        ourlangValue rhs = this.visit(ctx.expression(1));
        return new ourlangValue(!lhs.equals(rhs));
    }

    @Override
    public ourlangValue visitAndExpr(AndExprContext ctx) {
        ourlangValue lhs = this.visit(ctx.expression(0));
        ourlangValue rhs = this.visit(ctx.expression(1));
        return new ourlangValue(lhs.asBoolean() && rhs.asBoolean());
    }

    @Override
    public ourlangValue visitOrExpr(OrExprContext ctx) {
        ourlangValue lhs = this.visit(ctx.expression(0));
        ourlangValue rhs = this.visit(ctx.expression(1));
        return new ourlangValue(lhs.asBoolean() || rhs.asBoolean());
    }

    @Override
    public ourlangValue visitNumExpr(NumExprContext ctx) {
        return new ourlangValue(Double.valueOf(ctx.getText()));
    }

    @Override
    public ourlangValue visitBolExpr(BolExprContext ctx) {
        return new ourlangValue(Boolean.valueOf(ctx.getText()));
    }

    private ourlangValue resolveIndexes(ourlangValue val, List<ExpressionContext> indexes) {
        for (ExpressionContext ec: indexes) {
            ourlangValue idx = this.visit(ec);
            int i = idx.asDouble().intValue();
            if (val.isString()) {
                val = new ourlangValue(val.asString().substring(i, i+1));
            }
        }
        return val;
    }

    private void setAtIndex(ParserRuleContext ctx, List<ExpressionContext> indexes, ourlangValue val, ourlangValue newVal) {
        for (int i = 0; i < indexes.size() - 1; i++) {
            ourlangValue idx = this.visit(indexes.get(i));
            val = val.asList().get(idx.asDouble().intValue());
        }
        ourlangValue idx = this.visit(indexes.get(indexes.size() - 1));
        val.asList().set(idx.asDouble().intValue(), newVal);
    }

    @Override
    public ourlangValue visitNameExpr(NameExprContext ctx) {
        String id = ctx.NAME().getText();
        ourlangValue val = scope.resolve(id);
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public ourlangValue visitStrExpr(StrExprContext ctx) {
        String text = ctx.getText();
        text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
        ourlangValue val = new ourlangValue(text);
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public ourlangValue visitExprExpr(ExprExprContext ctx) {
        ourlangValue val = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(val, exps);
        }
        return val;
    }

    @Override
    public ourlangValue visitAssign(AssignContext ctx) {
        ourlangValue newVal = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            ourlangValue val = scope.resolve(ctx.NAME().getText());
            List<ExpressionContext> exps = ctx.indexes().expression();
            setAtIndex(ctx, exps, val, newVal);
        } else {
            String id = ctx.NAME().getText();
            scope.assign(id, newVal);
        }
        return ourlangValue.VOID;
    }

    @Override
    public ourlangValue visitPrint(PrintContext ctx) {
        if (ctx.expression() != null) {
            System.out.println(this.visit(ctx.expression()));
        } else {
            System.out.println();
        }
        return ourlangValue.VOID;
    }

    @Override
    public ourlangValue visitIfSt(IfStContext ctx) {
        if(this.visit(ctx.expression()).asBoolean()) {
            return this.visit(ctx.block());
        }
        return ourlangValue.VOID;
    }

    @Override
    public ourlangValue visitBlock(BlockContext ctx) {

        scope = new Scope(scope, false);
        for (StatementContext sx: ctx.statement()) {
            this.visit(sx);
        }
        ExpressionContext ex;
        if ((ex = ctx.expression()) != null) {
            returnValue.value = this.visit(ex);
            scope = scope.parent();
            throw returnValue;
        }
        scope = scope.parent();
        return ourlangValue.VOID;
    }

    @Override
    public ourlangValue visitForSt(ForStContext ctx) {
        int start = this.visit(ctx.expression(0)).asDouble().intValue();
        int stop = this.visit(ctx.expression(1)).asDouble().intValue();
        for(int i = start; i <= stop; i++) {
            scope.assign(ctx.NAME().getText(), new ourlangValue(i));
            ourlangValue returnValue = this.visit(ctx.block());
            if(returnValue != ourlangValue.VOID) {
                return returnValue;
            }
        }
        return ourlangValue.VOID;
    }

    @Override
    public ourlangValue visitWhileSt(WhileStContext ctx) {
        while( this.visit(ctx.expression()).asBoolean() ) {
            ourlangValue returnValue = this.visit(ctx.block());
            if (returnValue != ourlangValue.VOID) {
                return returnValue;
            }
        }
        return ourlangValue.VOID;
    }

}