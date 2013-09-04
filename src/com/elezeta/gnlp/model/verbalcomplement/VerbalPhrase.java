package com.elezeta.gnlp.model.verbalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.CoordinatingConjunction;
import com.elezeta.gnlp.model.XComplement;

public class VerbalPhrase extends VerbalComplement implements IModel {

	// A verbal phrase consists of a set of floating verbs and an optional floating preposition.

	Verb[] verb;
	
	@Optional
	@Position(element="verb",position=Position.WITHIN)
	CoordinatingConjunction preposition;

	@Optional
	XComplement[] complements;
	
}
