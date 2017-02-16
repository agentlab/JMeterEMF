/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ru.agentlab.jmeter.ecore.model.jmeter.JmeterFactory;
import ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage;

/**
 * This is the item provider adapter for a {@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreadGroupItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadGroupItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addErrorOnSamplePropertyDescriptor(object);
			addThreadsCountPropertyDescriptor(object);
			addRampTimePropertyDescriptor(object);
			addStartTimePropertyDescriptor(object);
			addEndTimePropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addDelayPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Error On Sample feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorOnSamplePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadGroup_errorOnSample_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadGroup_errorOnSample_feature", "_UI_ThreadGroup_type"),
				 JmeterPackage.Literals.THREAD_GROUP__ERROR_ON_SAMPLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Threads Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThreadsCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadGroup_threadsCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadGroup_threadsCount_feature", "_UI_ThreadGroup_type"),
				 JmeterPackage.Literals.THREAD_GROUP__THREADS_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ramp Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRampTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadGroup_rampTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadGroup_rampTime_feature", "_UI_ThreadGroup_type"),
				 JmeterPackage.Literals.THREAD_GROUP__RAMP_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadGroup_startTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadGroup_startTime_feature", "_UI_ThreadGroup_type"),
				 JmeterPackage.Literals.THREAD_GROUP__START_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadGroup_endTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadGroup_endTime_feature", "_UI_ThreadGroup_type"),
				 JmeterPackage.Literals.THREAD_GROUP__END_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadGroup_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadGroup_duration_feature", "_UI_ThreadGroup_type"),
				 JmeterPackage.Literals.THREAD_GROUP__DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadGroup_delay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadGroup_delay_feature", "_UI_ThreadGroup_type"),
				 JmeterPackage.Literals.THREAD_GROUP__DELAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(JmeterPackage.Literals.THREAD_GROUP__TIMER);
			childrenFeatures.add(JmeterPackage.Literals.THREAD_GROUP__RESULTCOLLECTOR);
			childrenFeatures.add(JmeterPackage.Literals.THREAD_GROUP__ACCESSLOGSAMPLER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ThreadGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ThreadGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup)object).getErrorOnSample();
		return label == null || label.length() == 0 ?
			getString("_UI_ThreadGroup_type") :
			getString("_UI_ThreadGroup_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup.class)) {
			case JmeterPackage.THREAD_GROUP__ERROR_ON_SAMPLE:
			case JmeterPackage.THREAD_GROUP__THREADS_COUNT:
			case JmeterPackage.THREAD_GROUP__RAMP_TIME:
			case JmeterPackage.THREAD_GROUP__START_TIME:
			case JmeterPackage.THREAD_GROUP__END_TIME:
			case JmeterPackage.THREAD_GROUP__DURATION:
			case JmeterPackage.THREAD_GROUP__DELAY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JmeterPackage.THREAD_GROUP__TIMER:
			case JmeterPackage.THREAD_GROUP__RESULTCOLLECTOR:
			case JmeterPackage.THREAD_GROUP__ACCESSLOGSAMPLER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(JmeterPackage.Literals.THREAD_GROUP__TIMER,
				 JmeterFactory.eINSTANCE.createTimer()));

		newChildDescriptors.add
			(createChildParameter
				(JmeterPackage.Literals.THREAD_GROUP__TIMER,
				 JmeterFactory.eINSTANCE.createUniformRandomTimer()));

		newChildDescriptors.add
			(createChildParameter
				(JmeterPackage.Literals.THREAD_GROUP__RESULTCOLLECTOR,
				 JmeterFactory.eINSTANCE.createResultCollector()));

		newChildDescriptors.add
			(createChildParameter
				(JmeterPackage.Literals.THREAD_GROUP__RESULTCOLLECTOR,
				 JmeterFactory.eINSTANCE.createTableResultCollector()));

		newChildDescriptors.add
			(createChildParameter
				(JmeterPackage.Literals.THREAD_GROUP__RESULTCOLLECTOR,
				 JmeterFactory.eINSTANCE.createGraphResultCollector()));

		newChildDescriptors.add
			(createChildParameter
				(JmeterPackage.Literals.THREAD_GROUP__RESULTCOLLECTOR,
				 JmeterFactory.eINSTANCE.createStatResultCollector()));

		newChildDescriptors.add
			(createChildParameter
				(JmeterPackage.Literals.THREAD_GROUP__ACCESSLOGSAMPLER,
				 JmeterFactory.eINSTANCE.createAccessLogSampler()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return JmeterEditPlugin.INSTANCE;
	}

}
