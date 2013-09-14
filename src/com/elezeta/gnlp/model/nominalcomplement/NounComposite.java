package com.elezeta.gnlp.model.nominalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.CoordinatingConjunction;
import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;
import com.elezeta.gnlp.model.adverbialcomplement.Adverb;

public class NounComposite extends NounComplement implements IModel {

	@Optional
	private Determiner determiner;

	@Minimum(2)
	private NounComplement[] complements;

	@Optional
	@Position(element="complements",position=Position.BEFORELAST)
	CoordinatingConjunction conjunction;
	
}
