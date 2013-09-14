package com.elezeta.gnlp.model.verbalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.CoordinatingConjunction;
import com.elezeta.gnlp.model.XComplement;

@FreeOrder
public class VerbPhrase extends VerbComplement implements IModel {

	Verb[] verb;
	
	@Optional
	@Position(element="verb",position=Position.WITHIN)
	CoordinatingConjunction preposition;

	@Optional
	XComplement[] complements;
	
}
