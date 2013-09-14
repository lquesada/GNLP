package com.elezeta.gnlp.model;

import org.modelcc.*;

import com.elezeta.gnlp.model.nominalcomplement.NounPhrase;
import com.elezeta.gnlp.model.verbalcomplement.VerbPhrase;

public class SimpleClause extends Clause implements IModel {
	
	@Optional
	private NounPhrase np;
	
	private VerbPhrase vp;
	
}
