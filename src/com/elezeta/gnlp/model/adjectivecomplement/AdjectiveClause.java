package com.elezeta.gnlp.model.adjectivecomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.Clause;
import com.elezeta.gnlp.model.SubordinatingConjunction;

public class AdjectiveClause extends AdjectiveComplement implements IModel {

	// An adjective clause consists of an optional subordinating conjunction and a subordinate clause.

	@Optional
	SubordinatingConjunction conjunction;
	
	Clause subordinateClause;

}
