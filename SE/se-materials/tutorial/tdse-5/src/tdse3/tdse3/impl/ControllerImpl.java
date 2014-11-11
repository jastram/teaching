/**
 */
package tdse3.tdse3.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdse3.tdse3.CarLight;
import tdse3.tdse3.Controller;
import tdse3.tdse3.PedLight;
import tdse3.tdse3.Tdse3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tdse3.tdse3.impl.ControllerImpl#getCarLight <em>Car Light</em>}</li>
 *   <li>{@link tdse3.tdse3.impl.ControllerImpl#getPedLight <em>Ped Light</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerImpl extends MinimalEObjectImpl.Container implements Controller {
	/**
	 * The cached value of the '{@link #getCarLight() <em>Car Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarLight()
	 * @generated
	 * @ordered
	 */
	protected CarLight carLight;

	/**
	 * The cached value of the '{@link #getPedLight() <em>Ped Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPedLight()
	 * @generated
	 * @ordered
	 */
	protected PedLight pedLight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tdse3Package.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarLight getCarLight() {
		return carLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarLight(CarLight newCarLight, NotificationChain msgs) {
		CarLight oldCarLight = carLight;
		carLight = newCarLight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tdse3Package.CONTROLLER__CAR_LIGHT, oldCarLight, newCarLight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarLight(CarLight newCarLight) {
		if (newCarLight != carLight) {
			NotificationChain msgs = null;
			if (carLight != null)
				msgs = ((InternalEObject)carLight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tdse3Package.CONTROLLER__CAR_LIGHT, null, msgs);
			if (newCarLight != null)
				msgs = ((InternalEObject)newCarLight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tdse3Package.CONTROLLER__CAR_LIGHT, null, msgs);
			msgs = basicSetCarLight(newCarLight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdse3Package.CONTROLLER__CAR_LIGHT, newCarLight, newCarLight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedLight getPedLight() {
		return pedLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPedLight(PedLight newPedLight, NotificationChain msgs) {
		PedLight oldPedLight = pedLight;
		pedLight = newPedLight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tdse3Package.CONTROLLER__PED_LIGHT, oldPedLight, newPedLight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPedLight(PedLight newPedLight) {
		if (newPedLight != pedLight) {
			NotificationChain msgs = null;
			if (pedLight != null)
				msgs = ((InternalEObject)pedLight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tdse3Package.CONTROLLER__PED_LIGHT, null, msgs);
			if (newPedLight != null)
				msgs = ((InternalEObject)newPedLight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tdse3Package.CONTROLLER__PED_LIGHT, null, msgs);
			msgs = basicSetPedLight(newPedLight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdse3Package.CONTROLLER__PED_LIGHT, newPedLight, newPedLight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void tick() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tdse3Package.CONTROLLER__CAR_LIGHT:
				return basicSetCarLight(null, msgs);
			case Tdse3Package.CONTROLLER__PED_LIGHT:
				return basicSetPedLight(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tdse3Package.CONTROLLER__CAR_LIGHT:
				return getCarLight();
			case Tdse3Package.CONTROLLER__PED_LIGHT:
				return getPedLight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tdse3Package.CONTROLLER__CAR_LIGHT:
				setCarLight((CarLight)newValue);
				return;
			case Tdse3Package.CONTROLLER__PED_LIGHT:
				setPedLight((PedLight)newValue);
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
			case Tdse3Package.CONTROLLER__CAR_LIGHT:
				setCarLight((CarLight)null);
				return;
			case Tdse3Package.CONTROLLER__PED_LIGHT:
				setPedLight((PedLight)null);
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
			case Tdse3Package.CONTROLLER__CAR_LIGHT:
				return carLight != null;
			case Tdse3Package.CONTROLLER__PED_LIGHT:
				return pedLight != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Tdse3Package.CONTROLLER___TICK:
				tick();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ControllerImpl
