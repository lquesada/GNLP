package com.elezeta.gnlp.model.adverbialcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.CoordinatingConjunction;
import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;

public class AdverbialComposite extends AdverbialComplement implements IModel {

	// An adverbial composite consists of a set of adverbial complements and an optional floating conjunction.

	@Minimum(2)
	private AdverbialComplement[] complements;

	@Optional
	@Position(element="complements",position=Position.BEFORELAST)
	CoordinatingConjunction conjunction;
	
}
