/**
 */
package jkind.xtext.jkind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.TupleExpr#getExprs <em>Exprs</em>}</li>
 * </ul>
 * </p>
 *
 * @see jkind.xtext.jkind.JkindPackage#getTupleExpr()
 * @model
 * @generated
 */
public interface TupleExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link jkind.xtext.jkind.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see jkind.xtext.jkind.JkindPackage#getTupleExpr_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getExprs();

} // TupleExpr
