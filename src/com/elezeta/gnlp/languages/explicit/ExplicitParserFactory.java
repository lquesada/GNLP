package com.elezeta.gnlp.languages.explicit;

import org.modelcc.parser.Parser;

import com.elezeta.gnlp.model.Sentence;

public abstract class ExplicitParserFactory {

	private ExplicitParserFactory() {
	}
	
	public static Parser<Sentence> generateParser() {
		//TODO
		Parser<Sentence> ret = null;
		return ret;
	}
	
}
