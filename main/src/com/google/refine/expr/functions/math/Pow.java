package com.google.refine.expr.functions.math;

import java.util.Properties;

import org.json.JSONException;
import org.json.JSONWriter;

import com.google.refine.gel.Function;

public class Pow implements Function {

    public Object call(Properties bindings, Object[] args) {
        if (args.length == 2 && args[0] instanceof Number && args[1] instanceof Number) {
            return Math.pow(
                ((Number) args[0]).doubleValue(),
                ((Number) args[1]).doubleValue()
            );
        }
        return null;
    }

    public void write(JSONWriter writer, Properties options)
        throws JSONException {
    
        writer.object();
        writer.key("description"); writer.value("Returns a^b");
        writer.key("params"); writer.value("number a, number b");
        writer.key("returns"); writer.value("number");
        writer.endObject();
    }
}