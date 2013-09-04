package com.elezeta.gnlp;

import org.modelcc.parser.Parser;

import com.elezeta.gnlp.model.Sentence;

public class GNLPCLI {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("GNLP (General Natural Language Parser) - Command-Line Interface");
			System.out.println("Copyright (c) 2013, Luis Quesada - https://github.com/lquesada");
		    System.out.println("");
		    System.out.println("Usage: java -jar GNLP.jar <language> <sentence>");
		    System.out.println("");
		    System.err.println("Example: java -jar GNLP.jar explicit \"It(Pronoun) is(Verb) raining(Verb)\"");
		    System.out.println("");
		    System.out.println("Supported languages:");
		    System.out.println("");
		    System.out.println("- explicit");
		    System.out.println("");
		    System.out.println("  Specify language elements directly: ");
		    System.out.println("    CoordinatingConjunction, SubordinatingConjunction, Verb, Adverb, Preposition,");
		    System.out.println("    Determiner, CommonNoun, ProperNoun, Pronoun");
		    System.out.println("");
		    System.out.println("  Example sentence: ");
		    System.out.println("");
		    System.out.println("  I(CommonNoun/ProperNoun) saw(CommonNoun/Verb) a(Determiner) tree(CommonNoun)");
		    System.exit(0);
		}
		if (args.length == 1) {
			System.err.println("Please, provide both the language identifier and the sentence to parse.");
		    System.err.println("");
		    System.err.println("Example: java -jar GNLP.jar explicit \"It(Pronoun) is(Verb) raining(Verb)\"");
		    System.exit(1);
		}
		if (args.length > 2) {
			System.err.println("Please, provide the sentence as a single argument. Use quotes if necessary.");
		    System.err.println("");
		    System.err.println("Example: java -jar GNLP.jar explicit \"It(Pronoun) is(Verb) raining(Verb)\"");
		    System.exit(1);
		}
		Parser<Sentence> parser;
		if (args[0].equals("explicit")) {
			
		}
		else {
			System.err.println("Invalid language: "+args[0]);
		    System.err.println("");
		    System.exit(1);
		}
	}
}
	    
