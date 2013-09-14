package com.elezeta.gnlp.model.adverbialcomplement;

import org.modelcc.*;

import com.elezeta.gnlp.model.Clause;
import com.elezeta.gnlp.model.SubordinatingConjunction;
import com.elezeta.gnlp.model.XComplement;
import com.elezeta.gnlp.model.XHead;

public class AdverbClause extends AdverbComplement implements IModel {

	@Optional
	SubordinatingConjunction conjunction;
	
	Clause subordinateClause;

}
