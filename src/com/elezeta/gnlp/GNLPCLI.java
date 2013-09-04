package com.elezeta.gnlp;

public class GNLPCLI {

	public static void main(String[] args) {
		if (args.length == 0) {
			showHelp();
		}
	}
	
	public static void showHelp() {
		System.out.println("GNLP (General Natural Language Parser) - Command-Line Interface");
		System.out.println("Copyright (c) 2013, Luis Quesada - https://github.com/lquesada");
	    System.out.println("");
	    System.out.println("Usage: java -jar GNLP.jar <language> <sentence>");
	    System.out.println("");
	    System.out.println("Example: java -jar GNLP.jar en \"I saw a picture of New York\"");
	    System.out.println("");
	    System.out.println("Supported languages:");
	    System.out.println("");
	    System.out.println("- dummy");
	    System.out.println("");
	    System.out.println("  Specify language elements directly: ");
	    System.out.println("    CoordinatingConjunction, SubordinatingConjunction, Verb, Adverb, Preposition,");
	    System.out.println("    Determiner, CommonNoun, ProperNoun, Pronoun");
	    System.out.println("");
	    System.out.println("  Example sentence: ");
	    System.out.println("");
	    System.out.println("  I(CommonNoun/ProperNoun) saw(CommonNoun/Verb) a(Determiner) tree(CommonNoun)");
	}
}
	    
