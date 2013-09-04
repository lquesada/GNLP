package com.elezeta.gnlp.model;

import org.modelcc.*;

import com.elezeta.gnlp.model.nominalcomplement.NominalPhrase;
import com.elezeta.gnlp.model.verbalcomplement.VerbalPhrase;

public class SimpleClause extends Clause implements IModel {
	
	@Optional
	private NominalPhrase np;
	
	private VerbalPhrase vp;
	
}
