package com.elezeta.gnlp.model.nominalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;
import com.elezeta.gnlp.model.adverbialcomplement.Adverb;

@FreeOrder
public class NounPhrase extends NounComplement implements IModel {

	@Optional
	private Determiner determiner;

	private Noun noun;
	
	private XComplement[] complements;
	
}
