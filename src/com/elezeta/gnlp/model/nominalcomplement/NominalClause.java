package com.elezeta.gnlp.model.nominalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;
import com.elezeta.gnlp.model.verbalcomplement.Conjunction;

public abstract class NominalClause extends NominalComplement implements IModel {

	// A nominal clause consists of an optional determiner, an optional subordinating conjunction and a subordinate clause. Nouns comprise common nouns, proper nouns, and pronouns. Pronouns, in turn, reference nouns and proper nouns.

	@Optional
	private Determiner determiner;

	@Optional
	SubordinatingConjunction conjunction;
	
	Clause subordinateClause;

}
