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

package com.liferay.service.persistence;

import com.liferay.model.PersistedAnimal;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the persisted animal service. This utility wraps <code>com.liferay.service.persistence.impl.PersistedAnimalPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAnimalPersistence
 * @generated
 */
public class PersistedAnimalUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(PersistedAnimal persistedAnimal) {
		getPersistence().clearCache(persistedAnimal);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, PersistedAnimal> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PersistedAnimal> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PersistedAnimal> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PersistedAnimal> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PersistedAnimal> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PersistedAnimal update(PersistedAnimal persistedAnimal) {
		return getPersistence().update(persistedAnimal);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PersistedAnimal update(
		PersistedAnimal persistedAnimal, ServiceContext serviceContext) {

		return getPersistence().update(persistedAnimal, serviceContext);
	}

	/**
	 * Returns all the persisted animals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching persisted animals
	 */
	public static List<PersistedAnimal> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the persisted animals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAnimalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of persisted animals
	 * @param end the upper bound of the range of persisted animals (not inclusive)
	 * @return the range of matching persisted animals
	 */
	public static List<PersistedAnimal> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the persisted animals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAnimalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of persisted animals
	 * @param end the upper bound of the range of persisted animals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching persisted animals
	 */
	public static List<PersistedAnimal> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PersistedAnimal> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the persisted animals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAnimalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of persisted animals
	 * @param end the upper bound of the range of persisted animals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching persisted animals
	 */
	public static List<PersistedAnimal> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PersistedAnimal> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first persisted animal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted animal
	 * @throws NoSuchPersistedAnimalException if a matching persisted animal could not be found
	 */
	public static PersistedAnimal findByUuid_First(
			String uuid, OrderByComparator<PersistedAnimal> orderByComparator)
		throws com.liferay.exception.NoSuchPersistedAnimalException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first persisted animal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted animal, or <code>null</code> if a matching persisted animal could not be found
	 */
	public static PersistedAnimal fetchByUuid_First(
		String uuid, OrderByComparator<PersistedAnimal> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last persisted animal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted animal
	 * @throws NoSuchPersistedAnimalException if a matching persisted animal could not be found
	 */
	public static PersistedAnimal findByUuid_Last(
			String uuid, OrderByComparator<PersistedAnimal> orderByComparator)
		throws com.liferay.exception.NoSuchPersistedAnimalException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last persisted animal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted animal, or <code>null</code> if a matching persisted animal could not be found
	 */
	public static PersistedAnimal fetchByUuid_Last(
		String uuid, OrderByComparator<PersistedAnimal> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the persisted animals before and after the current persisted animal in the ordered set where uuid = &#63;.
	 *
	 * @param animalId the primary key of the current persisted animal
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next persisted animal
	 * @throws NoSuchPersistedAnimalException if a persisted animal with the primary key could not be found
	 */
	public static PersistedAnimal[] findByUuid_PrevAndNext(
			long animalId, String uuid,
			OrderByComparator<PersistedAnimal> orderByComparator)
		throws com.liferay.exception.NoSuchPersistedAnimalException {

		return getPersistence().findByUuid_PrevAndNext(
			animalId, uuid, orderByComparator);
	}

	/**
	 * Removes all the persisted animals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of persisted animals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching persisted animals
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the persisted animal where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPersistedAnimalException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching persisted animal
	 * @throws NoSuchPersistedAnimalException if a matching persisted animal could not be found
	 */
	public static PersistedAnimal findByUUID_G(String uuid, long groupId)
		throws com.liferay.exception.NoSuchPersistedAnimalException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the persisted animal where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching persisted animal, or <code>null</code> if a matching persisted animal could not be found
	 */
	public static PersistedAnimal fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the persisted animal where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching persisted animal, or <code>null</code> if a matching persisted animal could not be found
	 */
	public static PersistedAnimal fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the persisted animal where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the persisted animal that was removed
	 */
	public static PersistedAnimal removeByUUID_G(String uuid, long groupId)
		throws com.liferay.exception.NoSuchPersistedAnimalException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of persisted animals where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching persisted animals
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the persisted animals where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching persisted animals
	 */
	public static List<PersistedAnimal> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the persisted animals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAnimalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of persisted animals
	 * @param end the upper bound of the range of persisted animals (not inclusive)
	 * @return the range of matching persisted animals
	 */
	public static List<PersistedAnimal> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the persisted animals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAnimalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of persisted animals
	 * @param end the upper bound of the range of persisted animals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching persisted animals
	 */
	public static List<PersistedAnimal> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PersistedAnimal> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the persisted animals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAnimalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of persisted animals
	 * @param end the upper bound of the range of persisted animals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching persisted animals
	 */
	public static List<PersistedAnimal> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PersistedAnimal> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first persisted animal in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted animal
	 * @throws NoSuchPersistedAnimalException if a matching persisted animal could not be found
	 */
	public static PersistedAnimal findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<PersistedAnimal> orderByComparator)
		throws com.liferay.exception.NoSuchPersistedAnimalException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first persisted animal in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching persisted animal, or <code>null</code> if a matching persisted animal could not be found
	 */
	public static PersistedAnimal fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<PersistedAnimal> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last persisted animal in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted animal
	 * @throws NoSuchPersistedAnimalException if a matching persisted animal could not be found
	 */
	public static PersistedAnimal findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<PersistedAnimal> orderByComparator)
		throws com.liferay.exception.NoSuchPersistedAnimalException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last persisted animal in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching persisted animal, or <code>null</code> if a matching persisted animal could not be found
	 */
	public static PersistedAnimal fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<PersistedAnimal> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the persisted animals before and after the current persisted animal in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param animalId the primary key of the current persisted animal
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next persisted animal
	 * @throws NoSuchPersistedAnimalException if a persisted animal with the primary key could not be found
	 */
	public static PersistedAnimal[] findByUuid_C_PrevAndNext(
			long animalId, String uuid, long companyId,
			OrderByComparator<PersistedAnimal> orderByComparator)
		throws com.liferay.exception.NoSuchPersistedAnimalException {

		return getPersistence().findByUuid_C_PrevAndNext(
			animalId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the persisted animals where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of persisted animals where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching persisted animals
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the persisted animal in the entity cache if it is enabled.
	 *
	 * @param persistedAnimal the persisted animal
	 */
	public static void cacheResult(PersistedAnimal persistedAnimal) {
		getPersistence().cacheResult(persistedAnimal);
	}

	/**
	 * Caches the persisted animals in the entity cache if it is enabled.
	 *
	 * @param persistedAnimals the persisted animals
	 */
	public static void cacheResult(List<PersistedAnimal> persistedAnimals) {
		getPersistence().cacheResult(persistedAnimals);
	}

	/**
	 * Creates a new persisted animal with the primary key. Does not add the persisted animal to the database.
	 *
	 * @param animalId the primary key for the new persisted animal
	 * @return the new persisted animal
	 */
	public static PersistedAnimal create(long animalId) {
		return getPersistence().create(animalId);
	}

	/**
	 * Removes the persisted animal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param animalId the primary key of the persisted animal
	 * @return the persisted animal that was removed
	 * @throws NoSuchPersistedAnimalException if a persisted animal with the primary key could not be found
	 */
	public static PersistedAnimal remove(long animalId)
		throws com.liferay.exception.NoSuchPersistedAnimalException {

		return getPersistence().remove(animalId);
	}

	public static PersistedAnimal updateImpl(PersistedAnimal persistedAnimal) {
		return getPersistence().updateImpl(persistedAnimal);
	}

	/**
	 * Returns the persisted animal with the primary key or throws a <code>NoSuchPersistedAnimalException</code> if it could not be found.
	 *
	 * @param animalId the primary key of the persisted animal
	 * @return the persisted animal
	 * @throws NoSuchPersistedAnimalException if a persisted animal with the primary key could not be found
	 */
	public static PersistedAnimal findByPrimaryKey(long animalId)
		throws com.liferay.exception.NoSuchPersistedAnimalException {

		return getPersistence().findByPrimaryKey(animalId);
	}

	/**
	 * Returns the persisted animal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param animalId the primary key of the persisted animal
	 * @return the persisted animal, or <code>null</code> if a persisted animal with the primary key could not be found
	 */
	public static PersistedAnimal fetchByPrimaryKey(long animalId) {
		return getPersistence().fetchByPrimaryKey(animalId);
	}

	/**
	 * Returns all the persisted animals.
	 *
	 * @return the persisted animals
	 */
	public static List<PersistedAnimal> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the persisted animals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAnimalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persisted animals
	 * @param end the upper bound of the range of persisted animals (not inclusive)
	 * @return the range of persisted animals
	 */
	public static List<PersistedAnimal> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the persisted animals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAnimalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persisted animals
	 * @param end the upper bound of the range of persisted animals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of persisted animals
	 */
	public static List<PersistedAnimal> findAll(
		int start, int end,
		OrderByComparator<PersistedAnimal> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the persisted animals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersistedAnimalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persisted animals
	 * @param end the upper bound of the range of persisted animals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of persisted animals
	 */
	public static List<PersistedAnimal> findAll(
		int start, int end,
		OrderByComparator<PersistedAnimal> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the persisted animals from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of persisted animals.
	 *
	 * @return the number of persisted animals
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PersistedAnimalPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<PersistedAnimalPersistence, PersistedAnimalPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			PersistedAnimalPersistence.class);

		ServiceTracker<PersistedAnimalPersistence, PersistedAnimalPersistence>
			serviceTracker =
				new ServiceTracker
					<PersistedAnimalPersistence, PersistedAnimalPersistence>(
						bundle.getBundleContext(),
						PersistedAnimalPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}