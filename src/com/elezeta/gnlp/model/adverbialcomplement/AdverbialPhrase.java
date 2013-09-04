package com.elezeta.gnlp.model.adverbialcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;

public class AdverbialPhrase extends AdverbialComplement implements IModel {

	// An adverbial phrase consists of an adverb.
	
	private Adverb adverb;
	
	@Optional
	XComplement[] complements;

}
