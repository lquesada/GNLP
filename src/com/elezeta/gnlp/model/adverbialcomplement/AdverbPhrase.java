package com.elezeta.gnlp.model.adverbialcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;

@FreeOrder
public class AdverbPhrase extends AdverbComplement implements IModel {

	private Adverb adverb;
	
	@Optional
	XComplement[] complements;

}
