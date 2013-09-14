package com.elezeta.gnlp.model.verbalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.CoordinatingConjunction;
import com.elezeta.gnlp.model.XComplement;

public class VerbComposite extends VerbComplement implements IModel {

	@Minimum(2)
	private VerbComplement[] complements;

	@Optional
	@Position(element="complements",position=Position.BEFORELAST)
	private CoordinatingConjunction conjunction;
	
}
