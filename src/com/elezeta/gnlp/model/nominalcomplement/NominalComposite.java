package com.elezeta.gnlp.model.nominalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.CoordinatingConjunction;
import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;
import com.elezeta.gnlp.model.adverbialcomplement.Adverb;

public class NominalComposite extends NominalComplement implements IModel {

	// A nominal composite consists of an optional determiner, a set of nominal complements and an optional floating conjunction.
	@Optional
	private Determiner determiner;

	@Minimum(2)
	private NominalComplement[] complements;

	@Optional
	@Position(element="complements",position=Position.BEFORELAST)
	CoordinatingConjunction conjunction;
	
}
