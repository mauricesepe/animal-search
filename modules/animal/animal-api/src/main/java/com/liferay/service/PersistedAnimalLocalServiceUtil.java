/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for PersistedAnimal. This utility wraps
 * <code>com.liferay.service.impl.PersistedAnimalLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAnimalLocalService
 * @generated
 */
public class PersistedAnimalLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.service.impl.PersistedAnimalLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the persisted animal to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersistedAnimalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param persistedAnimal the persisted animal
	 * @return the persisted animal that was added
	 */
	public static com.liferay.model.PersistedAnimal addPersistedAnimal(
		com.liferay.model.PersistedAnimal persistedAnimal) {

		return getService().addPersistedAnimal(persistedAnimal);
	}

	public static com.liferay.model.PersistedAnimal addPersistedAnimal(
		String name, String animalClass, int numberOfLegs,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().addPersistedAnimal(
			name, animalClass, numberOfLegs, serviceContext);
	}

	/**
	 * Creates a new persisted animal with the primary key. Does not add the persisted animal to the database.
	 *
	 * @param animalId the primary key for the new persisted animal
	 * @return the new persisted animal
	 */
	public static com.liferay.model.PersistedAnimal createPersistedAnimal(
		long animalId) {

		return getService().createPersistedAnimal(animalId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the persisted animal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersistedAnimalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param animalId the primary key of the persisted animal
	 * @return the persisted animal that was removed
	 * @throws PortalException if a persisted animal with the primary key could not be found
	 */
	public static com.liferay.model.PersistedAnimal deletePersistedAnimal(
			long animalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedAnimal(animalId);
	}

	/**
	 * Deletes the persisted animal from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersistedAnimalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param persistedAnimal the persisted animal
	 * @return the persisted animal that was removed
	 */
	public static com.liferay.model.PersistedAnimal deletePersistedAnimal(
		com.liferay.model.PersistedAnimal persistedAnimal) {

		return getService().deletePersistedAnimal(persistedAnimal);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.model.impl.PersistedAnimalModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.model.impl.PersistedAnimalModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.model.PersistedAnimal fetchPersistedAnimal(
		long animalId) {

		return getService().fetchPersistedAnimal(animalId);
	}

	/**
	 * Returns the persisted animal matching the UUID and group.
	 *
	 * @param uuid the persisted animal's UUID
	 * @param groupId the primary key of the group
	 * @return the matching persisted animal, or <code>null</code> if a matching persisted animal could not be found
	 */
	public static com.liferay.model.PersistedAnimal
		fetchPersistedAnimalByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchPersistedAnimalByUuidAndGroupId(uuid, groupId);
	}

	public static java.util.List<com.liferay.model.PersistedAnimal> findAll() {
		return getService().findAll();
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Returns the persisted animal with the primary key.
	 *
	 * @param animalId the primary key of the persisted animal
	 * @return the persisted animal
	 * @throws PortalException if a persisted animal with the primary key could not be found
	 */
	public static com.liferay.model.PersistedAnimal getPersistedAnimal(
			long animalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedAnimal(animalId);
	}

	/**
	 * Returns the persisted animal matching the UUID and group.
	 *
	 * @param uuid the persisted animal's UUID
	 * @param groupId the primary key of the group
	 * @return the matching persisted animal
	 * @throws PortalException if a matching persisted animal could not be found
	 */
	public static com.liferay.model.PersistedAnimal
			getPersistedAnimalByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedAnimalByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the persisted animals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.model.impl.PersistedAnimalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persisted animals
	 * @param end the upper bound of the range of persisted animals (not inclusive)
	 * @return the range of persisted animals
	 */
	public static java.util.List<com.liferay.model.PersistedAnimal>
		getPersistedAnimals(int start, int end) {

		return getService().getPersistedAnimals(start, end);
	}

	/**
	 * Returns all the persisted animals matching the UUID and company.
	 *
	 * @param uuid the UUID of the persisted animals
	 * @param companyId the primary key of the company
	 * @return the matching persisted animals, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.model.PersistedAnimal>
		getPersistedAnimalsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getPersistedAnimalsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of persisted animals matching the UUID and company.
	 *
	 * @param uuid the UUID of the persisted animals
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of persisted animals
	 * @param end the upper bound of the range of persisted animals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching persisted animals, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.model.PersistedAnimal>
		getPersistedAnimalsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.model.PersistedAnimal> orderByComparator) {

		return getService().getPersistedAnimalsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of persisted animals.
	 *
	 * @return the number of persisted animals
	 */
	public static int getPersistedAnimalsCount() {
		return getService().getPersistedAnimalsCount();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the persisted animal in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersistedAnimalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param persistedAnimal the persisted animal
	 * @return the persisted animal that was updated
	 */
	public static com.liferay.model.PersistedAnimal updatePersistedAnimal(
		com.liferay.model.PersistedAnimal persistedAnimal) {

		return getService().updatePersistedAnimal(persistedAnimal);
	}

	public static PersistedAnimalLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<PersistedAnimalLocalService, PersistedAnimalLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			PersistedAnimalLocalService.class);

		ServiceTracker<PersistedAnimalLocalService, PersistedAnimalLocalService>
			serviceTracker =
				new ServiceTracker
					<PersistedAnimalLocalService, PersistedAnimalLocalService>(
						bundle.getBundleContext(),
						PersistedAnimalLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}