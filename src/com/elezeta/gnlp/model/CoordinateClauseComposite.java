package com.elezeta.gnlp.model;

import org.modelcc.*;

public class CoordinateClauseComposite extends Clause implements IModel {

	@Optional
	@Position(element="clauses",position=Position.BEFORELAST)
	private CoordinatingConjunction conjunction;
	
	@Multiplicity(minimum=2)
	private Clause[] clauses;
}
