package com.elezeta.gnlp.model.prepositionalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;

public abstract class PrepositionalComposite extends PrepositionalComplement implements IModel {

	// A prepositional composite consists of a set of prepositional complements and an optional floating conjunction.

	@Optional
	private PrepositionalComplement[] complements;

	@Optional
	@Position(element="complements",position=Position.BEFORELAST)
	CoordinatingConjunction conjunction;
	
}
