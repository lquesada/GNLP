package com.elezeta.gnlp.model.nominalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;
import com.elezeta.gnlp.model.verbalcomplement.Conjunction;

public abstract class NominalPhrase extends NominalComplement implements IModel {

	// A nominal phrase consists of an optional determiner, a noun, and an optional set of complements.
	
	@Optional
	private Determiner determiner;
	
	private Noun noun;
	
	@Optional
	private XComplement[] complements;
	
}
