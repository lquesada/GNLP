package com.elezeta.gnlp.model.prepositionalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.CoordinatingConjunction;
import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;

public class PrepositionComposite extends PrepositionComplement implements IModel {

	@Minimum(2)
	private PrepositionComplement[] complements;

	@Optional
	@Position(element="complements",position=Position.BEFORELAST)
	CoordinatingConjunction conjunction;
	
}
