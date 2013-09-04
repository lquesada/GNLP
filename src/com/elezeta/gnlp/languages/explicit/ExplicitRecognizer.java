/*
 * ModelCC, under ModelCC Shared Software License, www.modelcc.org. Luis Quesada Torres.
 */


package com.elezeta.gnlp.languages.explicit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.Serializable;
import java.lang.reflect.Array;

import org.modelcc.lexer.recognizer.MatchedObject;
import org.modelcc.lexer.recognizer.PatternRecognizer;
import org.modelcc.lexer.recognizer.regexp.ShiftingCharSequence;

public final class ExplicitRecognizer extends PatternRecognizer {

	private static final long serialVersionUID = 1L;

	private String function;

	Pattern p;

    public ExplicitRecognizer(String arg) {
        super(arg);
        this.function = arg;
        p = Pattern.compile("[^ \\(\\)\\|]+\\([a-zA-Z]+(\\|[a-zA-Z]+)*\\)");
    }

    @Override
    public MatchedObject read(CharSequence cs,int start) {
        return read(new ShiftingCharSequence(cs),start);
    }

    public MatchedObject read(ShiftingCharSequence scs,int start) {
        boolean result;
        Matcher m;
        scs.shift(start);
        m = p.matcher(scs);
        result = m.lookingAt();
        String s;
        if (result) {
            s = m.group();
        	String inside = s.substring(s.indexOf('(')+1,s.length()-1);
        	String[] insides = inside.split("\\|");
        	Set<String> types = new HashSet<String>(Arrays.asList(insides));
        	if (types.contains(function)) {
        		return new MatchedObject(s,s);
        	}
        	else
        		return null;
        }
        else
            return null;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((function == null) ? 0 : function.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExplicitRecognizer other = (ExplicitRecognizer) obj;
		if (function == null) {
			if (other.function != null)
				return false;
		} else if (!function.equals(other.function))
			return false;
		return true;
	}

}
