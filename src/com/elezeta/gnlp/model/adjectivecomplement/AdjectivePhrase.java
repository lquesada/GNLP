package com.elezeta.gnlp.model.adjectivecomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;

@FreeOrder
public class AdjectivePhrase extends AdjectiveComplement implements IModel {

	private Adjective adjective;

	private XComplement[] complements;
}
