package com.elezeta.gnlp.model.prepositionalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;

@FreeOrder
public class PrepositionPhrase extends PrepositionComplement implements IModel {

	private Preposition preposition;
	
	private XHead head;

	@Optional
	XComplement[] complements;

}
