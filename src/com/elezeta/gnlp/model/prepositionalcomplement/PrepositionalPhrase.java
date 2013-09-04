package com.elezeta.gnlp.model.prepositionalcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;

@FreeOrder
public abstract class PrepositionalPhrase extends PrepositionalComplement implements IModel {

	// A prepositional phrase consists of a floating preposition and a head.
	
	private Preposition prepositional;
	
	private XHead head;
	
}
