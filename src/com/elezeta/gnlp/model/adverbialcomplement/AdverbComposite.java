package com.elezeta.gnlp.model.adverbialcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.CoordinatingConjunction;
import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;

public class AdverbComposite extends AdverbComplement implements IModel {

	@Minimum(2)
	private AdverbComplement[] complements;

	@Optional
	@Position(element="complements",position=Position.BEFORELAST)
	CoordinatingConjunction conjunction;
	
}
