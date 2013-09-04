package com.elezeta.gnlp.model;

import org.modelcc.*;

public class CoordinateClauseComposite extends Clause implements IModel {

	@Optional
	@Position(element="clauses",position=Position.BEFORELAST)
	private CoordinatingConjunction conjunction;
	
	@Minimum(2)
	private Clause[] clauses;
}
