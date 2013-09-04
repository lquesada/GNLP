package com.elezeta.gnlp.model.verbalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.CoordinatingConjunction;
import com.elezeta.gnlp.model.XComplement;

public class VerbalComposite extends VerbalComplement implements IModel {

	// A verbal composite consists of a set of verbal complements and an optional floating conjunction.

	@Optional
	@Position(element="complements",position=Position.BEFORELAST)
	CoordinatingConjunction conjunction;
	
	VerbalComplement[] complements;

}
