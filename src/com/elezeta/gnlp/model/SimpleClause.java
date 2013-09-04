package com.elezeta.gnlp.model;

import org.modelcc.*;

public class SimpleClause extends Clause implements IModel {
	
	@Optional
	private AdjectivePhrase np;
	
	private VerbalPhrase vp;
	
}
