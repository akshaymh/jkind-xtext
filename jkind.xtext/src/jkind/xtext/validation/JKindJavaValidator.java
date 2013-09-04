/*
* generated by Xtext
*/
package jkind.xtext.validation;

import jkind.xtext.jkind.Assertion;
import jkind.xtext.jkind.Constant;
import jkind.xtext.jkind.Equation;
import jkind.xtext.jkind.Property;

import org.eclipse.xtext.validation.Check;

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
public class JKindJavaValidator extends jkind.xtext.validation.AbstractJKindJavaValidator {
	@Check
	public void checkEquationType(Equation equation) {
		new TypeChecker(getMessageAcceptor()).check(equation);
	}
	
	@Check
	public void checkAssertionType(Assertion assertion) {
		new TypeChecker(getMessageAcceptor()).check(assertion);
	}
	
	@Check
	public void checkPropertyType(Property property) {
		new TypeChecker(getMessageAcceptor()).check(property);
	}
	
	@Check
	public void checkConstantTypes(Constant constant) {
		new TypeChecker(getMessageAcceptor()).check(constant);
	}
}
