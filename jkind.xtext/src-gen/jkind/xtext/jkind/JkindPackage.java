/**
 */
package jkind.xtext.jkind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jkind.xtext.jkind.JkindFactory
 * @model kind="package"
 * @generated
 */
public interface JkindPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jkind";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "https://github.com/agacek/jkind-xtext";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jkind";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JkindPackage eINSTANCE = jkind.xtext.jkind.impl.JkindPackageImpl.init();

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.FileImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getFile()
   * @generated
   */
  int FILE = 0;

  /**
   * The feature id for the '<em><b>Typedefs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__TYPEDEFS = 0;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__CONSTANTS = 1;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__NODES = 2;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.TypedefImpl <em>Typedef</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.TypedefImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getTypedef()
   * @generated
   */
  int TYPEDEF = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF__NAME = 0;

  /**
   * The number of structural features of the '<em>Typedef</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.TypeImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.FieldImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getField()
   * @generated
   */
  int FIELD = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.IdRefImpl <em>Id Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.IdRefImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getIdRef()
   * @generated
   */
  int ID_REF = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_REF__NAME = 0;

  /**
   * The number of structural features of the '<em>Id Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.ConstantImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = ID_REF__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__TYPE = ID_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__EXPR = ID_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = ID_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.NodeImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getNode()
   * @generated
   */
  int NODE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__INPUTS = 1;

  /**
   * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__OUTPUTS = 2;

  /**
   * The feature id for the '<em><b>Locals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__LOCALS = 3;

  /**
   * The feature id for the '<em><b>Equations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__EQUATIONS = 4;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__PROPERTIES = 5;

  /**
   * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__ASSERTIONS = 6;

  /**
   * The feature id for the '<em><b>Main</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__MAIN = 7;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.VariableGroupImpl <em>Variable Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.VariableGroupImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getVariableGroup()
   * @generated
   */
  int VARIABLE_GROUP = 6;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_GROUP__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_GROUP__TYPE = 1;

  /**
   * The number of structural features of the '<em>Variable Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_GROUP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.VariableImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = ID_REF__NAME;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = ID_REF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.EquationImpl <em>Equation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.EquationImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getEquation()
   * @generated
   */
  int EQUATION = 8;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUATION__LHS = 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUATION__RHS = 1;

  /**
   * The number of structural features of the '<em>Equation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.PropertyImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__REF = 0;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.AssertionImpl <em>Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.AssertionImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getAssertion()
   * @generated
   */
  int ASSERTION = 10;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__EXPR = 0;

  /**
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.ExprImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 11;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.AbbreviationTypeImpl <em>Abbreviation Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.AbbreviationTypeImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getAbbreviationType()
   * @generated
   */
  int ABBREVIATION_TYPE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREVIATION_TYPE__NAME = TYPEDEF__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREVIATION_TYPE__TYPE = TYPEDEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abbreviation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREVIATION_TYPE_FEATURE_COUNT = TYPEDEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.RecordTypeImpl <em>Record Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.RecordTypeImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getRecordType()
   * @generated
   */
  int RECORD_TYPE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__NAME = TYPEDEF__NAME;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__FIELDS = TYPEDEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__TYPES = TYPEDEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Record Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_FEATURE_COUNT = TYPEDEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.IntTypeImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 15;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.BoolTypeImpl <em>Bool Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.BoolTypeImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getBoolType()
   * @generated
   */
  int BOOL_TYPE = 16;

  /**
   * The number of structural features of the '<em>Bool Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.RealTypeImpl <em>Real Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.RealTypeImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getRealType()
   * @generated
   */
  int REAL_TYPE = 17;

  /**
   * The number of structural features of the '<em>Real Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.SubrangeTypeImpl <em>Subrange Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.SubrangeTypeImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getSubrangeType()
   * @generated
   */
  int SUBRANGE_TYPE = 18;

  /**
   * The feature id for the '<em><b>Low</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE__LOW = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>High</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE__HIGH = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Subrange Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.UserTypeImpl <em>User Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.UserTypeImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getUserType()
   * @generated
   */
  int USER_TYPE = 19;

  /**
   * The feature id for the '<em><b>Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE__DEF = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>User Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.BinaryExprImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getBinaryExpr()
   * @generated
   */
  int BINARY_EXPR = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.UnaryExprImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getUnaryExpr()
   * @generated
   */
  int UNARY_EXPR = 21;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__OP = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__EXPR = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.ProjectionExprImpl <em>Projection Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.ProjectionExprImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getProjectionExpr()
   * @generated
   */
  int PROJECTION_EXPR = 22;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION_EXPR__EXPR = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION_EXPR__FIELD = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Projection Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.IdExprImpl <em>Id Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.IdExprImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getIdExpr()
   * @generated
   */
  int ID_EXPR = 23;

  /**
   * The feature id for the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_EXPR__ID = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Id Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.IntExprImpl <em>Int Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.IntExprImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getIntExpr()
   * @generated
   */
  int INT_EXPR = 24;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_EXPR__VAL = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.RealExprImpl <em>Real Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.RealExprImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getRealExpr()
   * @generated
   */
  int REAL_EXPR = 25;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_EXPR__VAL = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.BoolExprImpl <em>Bool Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.BoolExprImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getBoolExpr()
   * @generated
   */
  int BOOL_EXPR = 26;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_EXPR__VAL = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.IfThenElseExprImpl <em>If Then Else Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.IfThenElseExprImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getIfThenElseExpr()
   * @generated
   */
  int IF_THEN_ELSE_EXPR = 27;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_EXPR__COND = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_EXPR__THEN = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_EXPR__ELSE = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Then Else Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.NodeCallExprImpl <em>Node Call Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.NodeCallExprImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getNodeCallExpr()
   * @generated
   */
  int NODE_CALL_EXPR = 28;

  /**
   * The feature id for the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_CALL_EXPR__NODE = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_CALL_EXPR__ARGS = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Node Call Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_CALL_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jkind.xtext.jkind.impl.RecordExprImpl <em>Record Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jkind.xtext.jkind.impl.RecordExprImpl
   * @see jkind.xtext.jkind.impl.JkindPackageImpl#getRecordExpr()
   * @generated
   */
  int RECORD_EXPR = 29;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_EXPR__TYPE = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_EXPR__FIELDS = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_EXPR__EXPRS = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Record Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see jkind.xtext.jkind.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.File#getTypedefs <em>Typedefs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typedefs</em>'.
   * @see jkind.xtext.jkind.File#getTypedefs()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Typedefs();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.File#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see jkind.xtext.jkind.File#getConstants()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Constants();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.File#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see jkind.xtext.jkind.File#getNodes()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Nodes();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.Typedef <em>Typedef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typedef</em>'.
   * @see jkind.xtext.jkind.Typedef
   * @generated
   */
  EClass getTypedef();

  /**
   * Returns the meta object for the attribute '{@link jkind.xtext.jkind.Typedef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jkind.xtext.jkind.Typedef#getName()
   * @see #getTypedef()
   * @generated
   */
  EAttribute getTypedef_Name();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see jkind.xtext.jkind.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see jkind.xtext.jkind.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link jkind.xtext.jkind.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jkind.xtext.jkind.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see jkind.xtext.jkind.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the containment reference '{@link jkind.xtext.jkind.Constant#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see jkind.xtext.jkind.Constant#getType()
   * @see #getConstant()
   * @generated
   */
  EReference getConstant_Type();

  /**
   * Returns the meta object for the containment reference '{@link jkind.xtext.jkind.Constant#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see jkind.xtext.jkind.Constant#getExpr()
   * @see #getConstant()
   * @generated
   */
  EReference getConstant_Expr();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see jkind.xtext.jkind.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link jkind.xtext.jkind.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jkind.xtext.jkind.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.Node#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see jkind.xtext.jkind.Node#getInputs()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Inputs();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.Node#getOutputs <em>Outputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outputs</em>'.
   * @see jkind.xtext.jkind.Node#getOutputs()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Outputs();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.Node#getLocals <em>Locals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Locals</em>'.
   * @see jkind.xtext.jkind.Node#getLocals()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Locals();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.Node#getEquations <em>Equations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Equations</em>'.
   * @see jkind.xtext.jkind.Node#getEquations()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Equations();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.Node#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see jkind.xtext.jkind.Node#getProperties()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.Node#getAssertions <em>Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assertions</em>'.
   * @see jkind.xtext.jkind.Node#getAssertions()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Assertions();

  /**
   * Returns the meta object for the attribute list '{@link jkind.xtext.jkind.Node#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Main</em>'.
   * @see jkind.xtext.jkind.Node#getMain()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Main();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.VariableGroup <em>Variable Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Group</em>'.
   * @see jkind.xtext.jkind.VariableGroup
   * @generated
   */
  EClass getVariableGroup();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.VariableGroup#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see jkind.xtext.jkind.VariableGroup#getVariables()
   * @see #getVariableGroup()
   * @generated
   */
  EReference getVariableGroup_Variables();

  /**
   * Returns the meta object for the containment reference '{@link jkind.xtext.jkind.VariableGroup#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see jkind.xtext.jkind.VariableGroup#getType()
   * @see #getVariableGroup()
   * @generated
   */
  EReference getVariableGroup_Type();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see jkind.xtext.jkind.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.Equation <em>Equation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equation</em>'.
   * @see jkind.xtext.jkind.Equation
   * @generated
   */
  EClass getEquation();

  /**
   * Returns the meta object for the reference list '{@link jkind.xtext.jkind.Equation#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Lhs</em>'.
   * @see jkind.xtext.jkind.Equation#getLhs()
   * @see #getEquation()
   * @generated
   */
  EReference getEquation_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link jkind.xtext.jkind.Equation#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see jkind.xtext.jkind.Equation#getRhs()
   * @see #getEquation()
   * @generated
   */
  EReference getEquation_Rhs();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see jkind.xtext.jkind.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the reference '{@link jkind.xtext.jkind.Property#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see jkind.xtext.jkind.Property#getRef()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Ref();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion</em>'.
   * @see jkind.xtext.jkind.Assertion
   * @generated
   */
  EClass getAssertion();

  /**
   * Returns the meta object for the containment reference '{@link jkind.xtext.jkind.Assertion#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see jkind.xtext.jkind.Assertion#getExpr()
   * @see #getAssertion()
   * @generated
   */
  EReference getAssertion_Expr();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see jkind.xtext.jkind.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.IdRef <em>Id Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Ref</em>'.
   * @see jkind.xtext.jkind.IdRef
   * @generated
   */
  EClass getIdRef();

  /**
   * Returns the meta object for the attribute '{@link jkind.xtext.jkind.IdRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jkind.xtext.jkind.IdRef#getName()
   * @see #getIdRef()
   * @generated
   */
  EAttribute getIdRef_Name();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.AbbreviationType <em>Abbreviation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abbreviation Type</em>'.
   * @see jkind.xtext.jkind.AbbreviationType
   * @generated
   */
  EClass getAbbreviationType();

  /**
   * Returns the meta object for the containment reference '{@link jkind.xtext.jkind.AbbreviationType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see jkind.xtext.jkind.AbbreviationType#getType()
   * @see #getAbbreviationType()
   * @generated
   */
  EReference getAbbreviationType_Type();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.RecordType <em>Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Type</em>'.
   * @see jkind.xtext.jkind.RecordType
   * @generated
   */
  EClass getRecordType();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.RecordType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see jkind.xtext.jkind.RecordType#getFields()
   * @see #getRecordType()
   * @generated
   */
  EReference getRecordType_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.RecordType#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see jkind.xtext.jkind.RecordType#getTypes()
   * @see #getRecordType()
   * @generated
   */
  EReference getRecordType_Types();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see jkind.xtext.jkind.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.BoolType <em>Bool Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Type</em>'.
   * @see jkind.xtext.jkind.BoolType
   * @generated
   */
  EClass getBoolType();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.RealType <em>Real Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Type</em>'.
   * @see jkind.xtext.jkind.RealType
   * @generated
   */
  EClass getRealType();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.SubrangeType <em>Subrange Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subrange Type</em>'.
   * @see jkind.xtext.jkind.SubrangeType
   * @generated
   */
  EClass getSubrangeType();

  /**
   * Returns the meta object for the attribute '{@link jkind.xtext.jkind.SubrangeType#getLow <em>Low</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Low</em>'.
   * @see jkind.xtext.jkind.SubrangeType#getLow()
   * @see #getSubrangeType()
   * @generated
   */
  EAttribute getSubrangeType_Low();

  /**
   * Returns the meta object for the attribute '{@link jkind.xtext.jkind.SubrangeType#getHigh <em>High</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>High</em>'.
   * @see jkind.xtext.jkind.SubrangeType#getHigh()
   * @see #getSubrangeType()
   * @generated
   */
  EAttribute getSubrangeType_High();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.UserType <em>User Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Type</em>'.
   * @see jkind.xtext.jkind.UserType
   * @generated
   */
  EClass getUserType();

  /**
   * Returns the meta object for the reference '{@link jkind.xtext.jkind.UserType#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Def</em>'.
   * @see jkind.xtext.jkind.UserType#getDef()
   * @see #getUserType()
   * @generated
   */
  EReference getUserType_Def();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.BinaryExpr <em>Binary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expr</em>'.
   * @see jkind.xtext.jkind.BinaryExpr
   * @generated
   */
  EClass getBinaryExpr();

  /**
   * Returns the meta object for the containment reference '{@link jkind.xtext.jkind.BinaryExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see jkind.xtext.jkind.BinaryExpr#getLeft()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link jkind.xtext.jkind.BinaryExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see jkind.xtext.jkind.BinaryExpr#getOp()
   * @see #getBinaryExpr()
   * @generated
   */
  EAttribute getBinaryExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link jkind.xtext.jkind.BinaryExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see jkind.xtext.jkind.BinaryExpr#getRight()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Right();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.UnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expr</em>'.
   * @see jkind.xtext.jkind.UnaryExpr
   * @generated
   */
  EClass getUnaryExpr();

  /**
   * Returns the meta object for the attribute '{@link jkind.xtext.jkind.UnaryExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see jkind.xtext.jkind.UnaryExpr#getOp()
   * @see #getUnaryExpr()
   * @generated
   */
  EAttribute getUnaryExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link jkind.xtext.jkind.UnaryExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see jkind.xtext.jkind.UnaryExpr#getExpr()
   * @see #getUnaryExpr()
   * @generated
   */
  EReference getUnaryExpr_Expr();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.ProjectionExpr <em>Projection Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Projection Expr</em>'.
   * @see jkind.xtext.jkind.ProjectionExpr
   * @generated
   */
  EClass getProjectionExpr();

  /**
   * Returns the meta object for the containment reference '{@link jkind.xtext.jkind.ProjectionExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see jkind.xtext.jkind.ProjectionExpr#getExpr()
   * @see #getProjectionExpr()
   * @generated
   */
  EReference getProjectionExpr_Expr();

  /**
   * Returns the meta object for the attribute '{@link jkind.xtext.jkind.ProjectionExpr#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field</em>'.
   * @see jkind.xtext.jkind.ProjectionExpr#getField()
   * @see #getProjectionExpr()
   * @generated
   */
  EAttribute getProjectionExpr_Field();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.IdExpr <em>Id Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Expr</em>'.
   * @see jkind.xtext.jkind.IdExpr
   * @generated
   */
  EClass getIdExpr();

  /**
   * Returns the meta object for the reference '{@link jkind.xtext.jkind.IdExpr#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Id</em>'.
   * @see jkind.xtext.jkind.IdExpr#getId()
   * @see #getIdExpr()
   * @generated
   */
  EReference getIdExpr_Id();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.IntExpr <em>Int Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Expr</em>'.
   * @see jkind.xtext.jkind.IntExpr
   * @generated
   */
  EClass getIntExpr();

  /**
   * Returns the meta object for the attribute '{@link jkind.xtext.jkind.IntExpr#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see jkind.xtext.jkind.IntExpr#getVal()
   * @see #getIntExpr()
   * @generated
   */
  EAttribute getIntExpr_Val();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.RealExpr <em>Real Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Expr</em>'.
   * @see jkind.xtext.jkind.RealExpr
   * @generated
   */
  EClass getRealExpr();

  /**
   * Returns the meta object for the attribute '{@link jkind.xtext.jkind.RealExpr#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see jkind.xtext.jkind.RealExpr#getVal()
   * @see #getRealExpr()
   * @generated
   */
  EAttribute getRealExpr_Val();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.BoolExpr <em>Bool Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Expr</em>'.
   * @see jkind.xtext.jkind.BoolExpr
   * @generated
   */
  EClass getBoolExpr();

  /**
   * Returns the meta object for the attribute '{@link jkind.xtext.jkind.BoolExpr#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see jkind.xtext.jkind.BoolExpr#getVal()
   * @see #getBoolExpr()
   * @generated
   */
  EAttribute getBoolExpr_Val();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.IfThenElseExpr <em>If Then Else Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Else Expr</em>'.
   * @see jkind.xtext.jkind.IfThenElseExpr
   * @generated
   */
  EClass getIfThenElseExpr();

  /**
   * Returns the meta object for the containment reference '{@link jkind.xtext.jkind.IfThenElseExpr#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see jkind.xtext.jkind.IfThenElseExpr#getCond()
   * @see #getIfThenElseExpr()
   * @generated
   */
  EReference getIfThenElseExpr_Cond();

  /**
   * Returns the meta object for the containment reference '{@link jkind.xtext.jkind.IfThenElseExpr#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see jkind.xtext.jkind.IfThenElseExpr#getThen()
   * @see #getIfThenElseExpr()
   * @generated
   */
  EReference getIfThenElseExpr_Then();

  /**
   * Returns the meta object for the containment reference '{@link jkind.xtext.jkind.IfThenElseExpr#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see jkind.xtext.jkind.IfThenElseExpr#getElse()
   * @see #getIfThenElseExpr()
   * @generated
   */
  EReference getIfThenElseExpr_Else();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.NodeCallExpr <em>Node Call Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Call Expr</em>'.
   * @see jkind.xtext.jkind.NodeCallExpr
   * @generated
   */
  EClass getNodeCallExpr();

  /**
   * Returns the meta object for the reference '{@link jkind.xtext.jkind.NodeCallExpr#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Node</em>'.
   * @see jkind.xtext.jkind.NodeCallExpr#getNode()
   * @see #getNodeCallExpr()
   * @generated
   */
  EReference getNodeCallExpr_Node();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.NodeCallExpr#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see jkind.xtext.jkind.NodeCallExpr#getArgs()
   * @see #getNodeCallExpr()
   * @generated
   */
  EReference getNodeCallExpr_Args();

  /**
   * Returns the meta object for class '{@link jkind.xtext.jkind.RecordExpr <em>Record Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Expr</em>'.
   * @see jkind.xtext.jkind.RecordExpr
   * @generated
   */
  EClass getRecordExpr();

  /**
   * Returns the meta object for the reference '{@link jkind.xtext.jkind.RecordExpr#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see jkind.xtext.jkind.RecordExpr#getType()
   * @see #getRecordExpr()
   * @generated
   */
  EReference getRecordExpr_Type();

  /**
   * Returns the meta object for the reference list '{@link jkind.xtext.jkind.RecordExpr#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Fields</em>'.
   * @see jkind.xtext.jkind.RecordExpr#getFields()
   * @see #getRecordExpr()
   * @generated
   */
  EReference getRecordExpr_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link jkind.xtext.jkind.RecordExpr#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see jkind.xtext.jkind.RecordExpr#getExprs()
   * @see #getRecordExpr()
   * @generated
   */
  EReference getRecordExpr_Exprs();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JkindFactory getJkindFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.FileImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>Typedefs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__TYPEDEFS = eINSTANCE.getFile_Typedefs();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__CONSTANTS = eINSTANCE.getFile_Constants();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__NODES = eINSTANCE.getFile_Nodes();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.TypedefImpl <em>Typedef</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.TypedefImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getTypedef()
     * @generated
     */
    EClass TYPEDEF = eINSTANCE.getTypedef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPEDEF__NAME = eINSTANCE.getTypedef_Name();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.TypeImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.FieldImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.ConstantImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__TYPE = eINSTANCE.getConstant_Type();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__EXPR = eINSTANCE.getConstant_Expr();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.NodeImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__INPUTS = eINSTANCE.getNode_Inputs();

    /**
     * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__OUTPUTS = eINSTANCE.getNode_Outputs();

    /**
     * The meta object literal for the '<em><b>Locals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__LOCALS = eINSTANCE.getNode_Locals();

    /**
     * The meta object literal for the '<em><b>Equations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__EQUATIONS = eINSTANCE.getNode_Equations();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__PROPERTIES = eINSTANCE.getNode_Properties();

    /**
     * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__ASSERTIONS = eINSTANCE.getNode_Assertions();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__MAIN = eINSTANCE.getNode_Main();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.VariableGroupImpl <em>Variable Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.VariableGroupImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getVariableGroup()
     * @generated
     */
    EClass VARIABLE_GROUP = eINSTANCE.getVariableGroup();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_GROUP__VARIABLES = eINSTANCE.getVariableGroup_Variables();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_GROUP__TYPE = eINSTANCE.getVariableGroup_Type();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.VariableImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.EquationImpl <em>Equation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.EquationImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getEquation()
     * @generated
     */
    EClass EQUATION = eINSTANCE.getEquation();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUATION__LHS = eINSTANCE.getEquation_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUATION__RHS = eINSTANCE.getEquation_Rhs();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.PropertyImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__REF = eINSTANCE.getProperty_Ref();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.AssertionImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getAssertion()
     * @generated
     */
    EClass ASSERTION = eINSTANCE.getAssertion();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__EXPR = eINSTANCE.getAssertion_Expr();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.ExprImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.IdRefImpl <em>Id Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.IdRefImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getIdRef()
     * @generated
     */
    EClass ID_REF = eINSTANCE.getIdRef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_REF__NAME = eINSTANCE.getIdRef_Name();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.AbbreviationTypeImpl <em>Abbreviation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.AbbreviationTypeImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getAbbreviationType()
     * @generated
     */
    EClass ABBREVIATION_TYPE = eINSTANCE.getAbbreviationType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABBREVIATION_TYPE__TYPE = eINSTANCE.getAbbreviationType_Type();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.RecordTypeImpl <em>Record Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.RecordTypeImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getRecordType()
     * @generated
     */
    EClass RECORD_TYPE = eINSTANCE.getRecordType();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_TYPE__FIELDS = eINSTANCE.getRecordType_Fields();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_TYPE__TYPES = eINSTANCE.getRecordType_Types();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.IntTypeImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.BoolTypeImpl <em>Bool Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.BoolTypeImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getBoolType()
     * @generated
     */
    EClass BOOL_TYPE = eINSTANCE.getBoolType();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.RealTypeImpl <em>Real Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.RealTypeImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getRealType()
     * @generated
     */
    EClass REAL_TYPE = eINSTANCE.getRealType();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.SubrangeTypeImpl <em>Subrange Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.SubrangeTypeImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getSubrangeType()
     * @generated
     */
    EClass SUBRANGE_TYPE = eINSTANCE.getSubrangeType();

    /**
     * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBRANGE_TYPE__LOW = eINSTANCE.getSubrangeType_Low();

    /**
     * The meta object literal for the '<em><b>High</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBRANGE_TYPE__HIGH = eINSTANCE.getSubrangeType_High();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.UserTypeImpl <em>User Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.UserTypeImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getUserType()
     * @generated
     */
    EClass USER_TYPE = eINSTANCE.getUserType();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_TYPE__DEF = eINSTANCE.getUserType_Def();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.BinaryExprImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getBinaryExpr()
     * @generated
     */
    EClass BINARY_EXPR = eINSTANCE.getBinaryExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPR__LEFT = eINSTANCE.getBinaryExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_EXPR__OP = eINSTANCE.getBinaryExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPR__RIGHT = eINSTANCE.getBinaryExpr_Right();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.UnaryExprImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getUnaryExpr()
     * @generated
     */
    EClass UNARY_EXPR = eINSTANCE.getUnaryExpr();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPR__OP = eINSTANCE.getUnaryExpr_Op();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPR__EXPR = eINSTANCE.getUnaryExpr_Expr();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.ProjectionExprImpl <em>Projection Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.ProjectionExprImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getProjectionExpr()
     * @generated
     */
    EClass PROJECTION_EXPR = eINSTANCE.getProjectionExpr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECTION_EXPR__EXPR = eINSTANCE.getProjectionExpr_Expr();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECTION_EXPR__FIELD = eINSTANCE.getProjectionExpr_Field();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.IdExprImpl <em>Id Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.IdExprImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getIdExpr()
     * @generated
     */
    EClass ID_EXPR = eINSTANCE.getIdExpr();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID_EXPR__ID = eINSTANCE.getIdExpr_Id();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.IntExprImpl <em>Int Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.IntExprImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getIntExpr()
     * @generated
     */
    EClass INT_EXPR = eINSTANCE.getIntExpr();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_EXPR__VAL = eINSTANCE.getIntExpr_Val();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.RealExprImpl <em>Real Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.RealExprImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getRealExpr()
     * @generated
     */
    EClass REAL_EXPR = eINSTANCE.getRealExpr();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_EXPR__VAL = eINSTANCE.getRealExpr_Val();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.BoolExprImpl <em>Bool Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.BoolExprImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getBoolExpr()
     * @generated
     */
    EClass BOOL_EXPR = eINSTANCE.getBoolExpr();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_EXPR__VAL = eINSTANCE.getBoolExpr_Val();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.IfThenElseExprImpl <em>If Then Else Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.IfThenElseExprImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getIfThenElseExpr()
     * @generated
     */
    EClass IF_THEN_ELSE_EXPR = eINSTANCE.getIfThenElseExpr();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE_EXPR__COND = eINSTANCE.getIfThenElseExpr_Cond();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE_EXPR__THEN = eINSTANCE.getIfThenElseExpr_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE_EXPR__ELSE = eINSTANCE.getIfThenElseExpr_Else();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.NodeCallExprImpl <em>Node Call Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.NodeCallExprImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getNodeCallExpr()
     * @generated
     */
    EClass NODE_CALL_EXPR = eINSTANCE.getNodeCallExpr();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_CALL_EXPR__NODE = eINSTANCE.getNodeCallExpr_Node();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_CALL_EXPR__ARGS = eINSTANCE.getNodeCallExpr_Args();

    /**
     * The meta object literal for the '{@link jkind.xtext.jkind.impl.RecordExprImpl <em>Record Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jkind.xtext.jkind.impl.RecordExprImpl
     * @see jkind.xtext.jkind.impl.JkindPackageImpl#getRecordExpr()
     * @generated
     */
    EClass RECORD_EXPR = eINSTANCE.getRecordExpr();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_EXPR__TYPE = eINSTANCE.getRecordExpr_Type();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_EXPR__FIELDS = eINSTANCE.getRecordExpr_Fields();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_EXPR__EXPRS = eINSTANCE.getRecordExpr_Exprs();

  }

} //JkindPackage
