/*
 * generated by Xtext
 */
package jkind.xtext.scoping;

import jkind.xtext.jkind.Expr;
import jkind.xtext.jkind.RecordAccessExpr;
import jkind.xtext.jkind.RecordExpr;
import jkind.xtext.jkind.RecordType;
import jkind.xtext.jkind.RecordUpdateExpr;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping on how and when
 * to use it
 * 
 */
public class JKindScopeProvider extends
		org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {
	IScope scope_RecordExpr_fields(RecordExpr e, @SuppressWarnings("unused") EReference reference) {
		return Scopes.scopeFor(e.getType().getFields());
	}

	IScope scope_RecordAccessExpr_field(RecordAccessExpr e,
			@SuppressWarnings("unused") EReference reference) {
		return getRecordScope(e.getRecord());
	}
	
	IScope scope_RecordUpdateExpr_field(RecordUpdateExpr e,
			@SuppressWarnings("unused") EReference reference) {
		return getRecordScope(e.getRecord());
	}

	private IScope getRecordScope(Expr expr) {
		RecordType record = CompositeTypeLookup.getRecordType(expr);
		if (record != null) {
			return Scopes.scopeFor(record.getFields());
		} else {
			return IScope.NULLSCOPE;
		}
	}
}
