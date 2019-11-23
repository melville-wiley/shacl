package org.topbraid.shacl.validation.java;

import org.apache.jena.sparql.expr.Expr;

class MinInclusiveConstraintExecutor extends AbstractClusiveConstraintExecutor {

	public MinInclusiveConstraintExecutor() {
		super(t -> Expr.CMP_LESS == t || Expr.CMP_EQUAL == t, "greater than or equal to");
	}
}
