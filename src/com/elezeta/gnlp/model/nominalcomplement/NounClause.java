package com.elezeta.gnlp.model.nominalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.Clause;
import com.elezeta.gnlp.model.SubordinatingConjunction;
import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;

public class NounClause extends NounComplement implements IModel {

	@Optional
	private Determiner determiner;

	@Optional
	SubordinatingConjunction conjunction;
	
	Clause subordinateClause;

}
