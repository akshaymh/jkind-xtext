/**
 */
package jkind.xtext.jkind.impl;

import java.util.Collection;

import jkind.xtext.jkind.Expr;
import jkind.xtext.jkind.Field;
import jkind.xtext.jkind.JkindPackage;
import jkind.xtext.jkind.RecordExpr;
import jkind.xtext.jkind.Typedef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jkind.xtext.jkind.impl.RecordExprImpl#getDef <em>Def</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.RecordExprImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link jkind.xtext.jkind.impl.RecordExprImpl#getExprs <em>Exprs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordExprImpl extends ExprImpl implements RecordExpr
{
  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected Typedef def;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field> fields;

  /**
   * The cached value of the '{@link #getExprs() <em>Exprs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprs()
   * @generated
   * @ordered
   */
  protected EList<Expr> exprs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordExprImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JkindPackage.Literals.RECORD_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Typedef getDef()
  {
    if (def != null && def.eIsProxy())
    {
      InternalEObject oldDef = (InternalEObject)def;
      def = (Typedef)eResolveProxy(oldDef);
      if (def != oldDef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, JkindPackage.RECORD_EXPR__DEF, oldDef, def));
      }
    }
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Typedef basicGetDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(Typedef newDef)
  {
    Typedef oldDef = def;
    def = newDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JkindPackage.RECORD_EXPR__DEF, oldDef, def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectResolvingEList<Field>(Field.class, this, JkindPackage.RECORD_EXPR__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getExprs()
  {
    if (exprs == null)
    {
      exprs = new EObjectContainmentEList<Expr>(Expr.class, this, JkindPackage.RECORD_EXPR__EXPRS);
    }
    return exprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JkindPackage.RECORD_EXPR__EXPRS:
        return ((InternalEList<?>)getExprs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JkindPackage.RECORD_EXPR__DEF:
        if (resolve) return getDef();
        return basicGetDef();
      case JkindPackage.RECORD_EXPR__FIELDS:
        return getFields();
      case JkindPackage.RECORD_EXPR__EXPRS:
        return getExprs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JkindPackage.RECORD_EXPR__DEF:
        setDef((Typedef)newValue);
        return;
      case JkindPackage.RECORD_EXPR__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
        return;
      case JkindPackage.RECORD_EXPR__EXPRS:
        getExprs().clear();
        getExprs().addAll((Collection<? extends Expr>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JkindPackage.RECORD_EXPR__DEF:
        setDef((Typedef)null);
        return;
      case JkindPackage.RECORD_EXPR__FIELDS:
        getFields().clear();
        return;
      case JkindPackage.RECORD_EXPR__EXPRS:
        getExprs().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JkindPackage.RECORD_EXPR__DEF:
        return def != null;
      case JkindPackage.RECORD_EXPR__FIELDS:
        return fields != null && !fields.isEmpty();
      case JkindPackage.RECORD_EXPR__EXPRS:
        return exprs != null && !exprs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RecordExprImpl
