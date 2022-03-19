package main;

import java.util.HashMap;
import java.util.Map;

public class Scope {

    private Scope parent;
    private Map<String, ourlangValue> variables;
    private boolean isFunction;

    Scope() {
        this(null, false);
    }

    Scope(Scope p, boolean function) {
        parent = p;
        variables = new HashMap<>();
        isFunction = function;
    }
    
    public void assignParam(String var, ourlangValue value) {
    	variables.put(var, value);
    }
    
    public void assign(String var, ourlangValue value) {
        if(resolve(var, !isFunction) != null) {
            this.reAssign(var, value);
        }
        else {
            variables.put(var, value);
        }
    }

    private boolean isGlobalScope() {
        return parent == null;
    }

    public Scope parent() {
        return parent;
    }

    private void reAssign(String identifier, ourlangValue value) {
        if(variables.containsKey(identifier)) {
            variables.put(identifier, value);
        }
        else if(parent != null) {
            parent.reAssign(identifier, value);
        }
    }

    public ourlangValue resolve(String var) {
        return resolve(var, true);
    }

    private ourlangValue resolve(String var, boolean checkParent) {
        ourlangValue value = variables.get(var);
        if(value != null) {
            return value;
        }
        else if(checkParent && !isGlobalScope()) {
            return parent.resolve(var, !parent.isFunction);
        }
        else {
            return null;
        }
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	for(Map.Entry<String, ourlangValue> var: variables.entrySet()) {
    		sb.append(var.getKey()).append("->").append(var.getValue()).append(",");
    	}
    	return sb.toString();
    }
}
