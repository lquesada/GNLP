package com.elezeta.gnlp.model.adjectivecomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.CoordinatingConjunction;
import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;

public class AdjectiveComposite extends AdjectiveComplement implements IModel {

	// An adjective composite consists of a set of adjective complements and an optional floating conjunction.

	@Minimum(2)
	private AdjectiveComplement[] complements;

	@Optional
	@Position(element="complements",position=Position.BEFORELAST)
	CoordinatingConjunction conjunction;
	
}
