package com.elezeta.gnlp.languages.explicit;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import org.modelcc.csm.CSM;
import org.modelcc.io.java.JavaModelReader;
import org.modelcc.metamodel.Model;
import org.modelcc.parser.Parser;
import org.modelcc.parser.ProbabilisticParserFactory;

import com.elezeta.gnlp.model.Sentence;

public abstract class ExplicitParserFactory {

	private ExplicitParserFactory() {
	}
	
	public static Parser<Sentence> generateParser() throws Exception {
		Model m = JavaModelReader.read(Sentence.class);
		Reader mappingReader = fileToReader("/com/elezeta/gnlp/languages/explicit/mapping.txt");
		Model m2 = CSM.apply(m,mappingReader);
        Parser<Sentence> parser = ProbabilisticParserFactory.create(m2,ProbabilisticParserFactory.WHITESPACE);
		return parser;
	}

	private static Reader fileToReader(String resourceName) throws UnsupportedEncodingException {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(resourceName.substring(1));
        return new BufferedReader(new InputStreamReader(is,"UTF-8"));
    }

}
