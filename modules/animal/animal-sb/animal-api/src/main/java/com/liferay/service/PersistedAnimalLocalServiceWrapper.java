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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PersistedAnimalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAnimalLocalService
 * @generated
 */
public class PersistedAnimalLocalServiceWrapper
	implements PersistedAnimalLocalService,
			   ServiceWrapper<PersistedAnimalLocalService> {

	public PersistedAnimalLocalServiceWrapper(
		PersistedAnimalLocalService persistedAnimalLocalService) {

		_persistedAnimalLocalService = persistedAnimalLocalService;
	}

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
	@Override
	public com.liferay.model.PersistedAnimal addPersistedAnimal(
		com.liferay.model.PersistedAnimal persistedAnimal) {

		return _persistedAnimalLocalService.addPersistedAnimal(persistedAnimal);
	}

	@Override
	public com.liferay.model.PersistedAnimal addPersistedAnimal(
		String name, String animalClass, int numberOfLegs,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _persistedAnimalLocalService.addPersistedAnimal(
			name, animalClass, numberOfLegs, serviceContext);
	}

	/**
	 * Creates a new persisted animal with the primary key. Does not add the persisted animal to the database.
	 *
	 * @param animalId the primary key for the new persisted animal
	 * @return the new persisted animal
	 */
	@Override
	public com.liferay.model.PersistedAnimal createPersistedAnimal(
		long animalId) {

		return _persistedAnimalLocalService.createPersistedAnimal(animalId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _persistedAnimalLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.model.PersistedAnimal deletePersistedAnimal(
			long animalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _persistedAnimalLocalService.deletePersistedAnimal(animalId);
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
	@Override
	public com.liferay.model.PersistedAnimal deletePersistedAnimal(
		com.liferay.model.PersistedAnimal persistedAnimal) {

		return _persistedAnimalLocalService.deletePersistedAnimal(
			persistedAnimal);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _persistedAnimalLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _persistedAnimalLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _persistedAnimalLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _persistedAnimalLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _persistedAnimalLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _persistedAnimalLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _persistedAnimalLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.model.PersistedAnimal fetchPersistedAnimal(
		long animalId) {

		return _persistedAnimalLocalService.fetchPersistedAnimal(animalId);
	}

	/**
	 * Returns the persisted animal matching the UUID and group.
	 *
	 * @param uuid the persisted animal's UUID
	 * @param groupId the primary key of the group
	 * @return the matching persisted animal, or <code>null</code> if a matching persisted animal could not be found
	 */
	@Override
	public com.liferay.model.PersistedAnimal
		fetchPersistedAnimalByUuidAndGroupId(String uuid, long groupId) {

		return _persistedAnimalLocalService.
			fetchPersistedAnimalByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List<com.liferay.model.PersistedAnimal> findAll() {
		return _persistedAnimalLocalService.findAll();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _persistedAnimalLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _persistedAnimalLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _persistedAnimalLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _persistedAnimalLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the persisted animal with the primary key.
	 *
	 * @param animalId the primary key of the persisted animal
	 * @return the persisted animal
	 * @throws PortalException if a persisted animal with the primary key could not be found
	 */
	@Override
	public com.liferay.model.PersistedAnimal getPersistedAnimal(long animalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _persistedAnimalLocalService.getPersistedAnimal(animalId);
	}

	/**
	 * Returns the persisted animal matching the UUID and group.
	 *
	 * @param uuid the persisted animal's UUID
	 * @param groupId the primary key of the group
	 * @return the matching persisted animal
	 * @throws PortalException if a matching persisted animal could not be found
	 */
	@Override
	public com.liferay.model.PersistedAnimal getPersistedAnimalByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _persistedAnimalLocalService.getPersistedAnimalByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.liferay.model.PersistedAnimal>
		getPersistedAnimals(int start, int end) {

		return _persistedAnimalLocalService.getPersistedAnimals(start, end);
	}

	/**
	 * Returns all the persisted animals matching the UUID and company.
	 *
	 * @param uuid the UUID of the persisted animals
	 * @param companyId the primary key of the company
	 * @return the matching persisted animals, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.model.PersistedAnimal>
		getPersistedAnimalsByUuidAndCompanyId(String uuid, long companyId) {

		return _persistedAnimalLocalService.
			getPersistedAnimalsByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.liferay.model.PersistedAnimal>
		getPersistedAnimalsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.model.PersistedAnimal> orderByComparator) {

		return _persistedAnimalLocalService.
			getPersistedAnimalsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of persisted animals.
	 *
	 * @return the number of persisted animals
	 */
	@Override
	public int getPersistedAnimalsCount() {
		return _persistedAnimalLocalService.getPersistedAnimalsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _persistedAnimalLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.model.PersistedAnimal updatePersistedAnimal(
		com.liferay.model.PersistedAnimal persistedAnimal) {

		return _persistedAnimalLocalService.updatePersistedAnimal(
			persistedAnimal);
	}

	@Override
	public PersistedAnimalLocalService getWrappedService() {
		return _persistedAnimalLocalService;
	}

	@Override
	public void setWrappedService(
		PersistedAnimalLocalService persistedAnimalLocalService) {

		_persistedAnimalLocalService = persistedAnimalLocalService;
	}

	private PersistedAnimalLocalService _persistedAnimalLocalService;

}