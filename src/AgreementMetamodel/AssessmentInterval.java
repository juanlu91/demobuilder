/**
 */
package AgreementMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Assessment Interval</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see AgreementMetamodel.AgreementMetamodelPackage#getAssessmentInterval()
 * @model
 * @generated
 */
public enum AssessmentInterval implements Enumerator {
	/**
	 * The '<em><b>YEARLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARLY_VALUE
	 * @generated
	 * @ordered
	 */
	YEARLY(0, "YEARLY", "YEARLY"),

	/**
	 * The '<em><b>MONTHLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTHLY_VALUE
	 * @generated
	 * @ordered
	 */
	MONTHLY(1, "MONTHLY", "MONTHLY"),

	/**
	 * The '<em><b>WEEKLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEKLY_VALUE
	 * @generated
	 * @ordered
	 */
	WEEKLY(2, "WEEKLY", "WEEKLY"),

	/**
	 * The '<em><b>DAILY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAILY_VALUE
	 * @generated
	 * @ordered
	 */
	DAILY(3, "DAILY", "DAILY"),

	/**
	 * The '<em><b>HOURLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOURLY_VALUE
	 * @generated
	 * @ordered
	 */
	HOURLY(4, "HOURLY", "HOURLY");

	/**
	 * The '<em><b>YEARLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YEARLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YEARLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEARLY_VALUE = 0;

	/**
	 * The '<em><b>MONTHLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MONTHLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONTHLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MONTHLY_VALUE = 1;

	/**
	 * The '<em><b>WEEKLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEEKLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEEKLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEEKLY_VALUE = 2;

	/**
	 * The '<em><b>DAILY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAILY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAILY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAILY_VALUE = 3;

	/**
	 * The '<em><b>HOURLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOURLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOURLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOURLY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Assessment Interval</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssessmentInterval[] VALUES_ARRAY =
		new AssessmentInterval[] {
			YEARLY,
			MONTHLY,
			WEEKLY,
			DAILY,
			HOURLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Assessment Interval</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssessmentInterval> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Assessment Interval</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssessmentInterval get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssessmentInterval result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assessment Interval</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssessmentInterval getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssessmentInterval result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assessment Interval</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssessmentInterval get(int value) {
		switch (value) {
			case YEARLY_VALUE: return YEARLY;
			case MONTHLY_VALUE: return MONTHLY;
			case WEEKLY_VALUE: return WEEKLY;
			case DAILY_VALUE: return DAILY;
			case HOURLY_VALUE: return HOURLY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AssessmentInterval(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AssessmentInterval
