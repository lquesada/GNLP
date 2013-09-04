package com.elezeta.gnlp.model.adverbialcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.Clause;
import com.elezeta.gnlp.model.SubordinatingConjunction;
import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;

public abstract class AdverbialClause extends AdverbialComplement implements IModel {

	// An adverbial clause consists of an optional subordinating conjunction and a subordinate clause.

	@Optional
	SubordinatingConjunction conjunction;
	
	Clause subordinateClause;

}
