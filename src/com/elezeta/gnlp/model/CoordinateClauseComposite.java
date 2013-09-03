package com.elezeta.gnlp.model;

import org.modelcc.*;

public class CoordinateClauseComposite extends Clause implements IModel {

	@Optional
	@Position(element="clauses",position=Position.BEFORELAST,separatorPolicy=SeparatorPolicy.AFTER)
	private CoordinatingConjunction conjunction;
	
	private Clause[] clauses;
}
