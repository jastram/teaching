/**
 */
package tdse3.tdse3.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import tdse3.tdse3.PedLight;
import tdse3.tdse3.Tdse3Package;
import tdse3.tdse3.colors;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ped Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tdse3.tdse3.impl.PedLightImpl#getColors <em>Colors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PedLightImpl extends MinimalEObjectImpl.Container implements PedLight {
	/**
	 * The cached value of the '{@link #getColors() <em>Colors</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColors()
	 * @generated
	 * @ordered
	 */
	protected EList<colors> colors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedLightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tdse3Package.Literals.PED_LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<colors> getColors() {
		if (colors == null) {
			colors = new EDataTypeUniqueEList<colors>(colors.class, this, Tdse3Package.PED_LIGHT__COLORS);
		}
		return colors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tdse3Package.PED_LIGHT__COLORS:
				return getColors();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tdse3Package.PED_LIGHT__COLORS:
				getColors().clear();
				getColors().addAll((Collection<? extends colors>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Tdse3Package.PED_LIGHT__COLORS:
				getColors().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Tdse3Package.PED_LIGHT__COLORS:
				return colors != null && !colors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (colors: ");
		result.append(colors);
		result.append(')');
		return result.toString();
	}

} //PedLightImpl
