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

package com.liferay.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PersistedAnimal}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAnimal
 * @generated
 */
public class PersistedAnimalWrapper
	extends BaseModelWrapper<PersistedAnimal>
	implements ModelWrapper<PersistedAnimal>, PersistedAnimal {

	public PersistedAnimalWrapper(PersistedAnimal persistedAnimal) {
		super(persistedAnimal);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("animalId", getAnimalId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("animalClass", getAnimalClass());
		attributes.put("numberOfLegs", getNumberOfLegs());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long animalId = (Long)attributes.get("animalId");

		if (animalId != null) {
			setAnimalId(animalId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String animalClass = (String)attributes.get("animalClass");

		if (animalClass != null) {
			setAnimalClass(animalClass);
		}

		Integer numberOfLegs = (Integer)attributes.get("numberOfLegs");

		if (numberOfLegs != null) {
			setNumberOfLegs(numberOfLegs);
		}
	}

	/**
	 * Returns the animal class of this persisted animal.
	 *
	 * @return the animal class of this persisted animal
	 */
	@Override
	public String getAnimalClass() {
		return model.getAnimalClass();
	}

	/**
	 * Returns the animal ID of this persisted animal.
	 *
	 * @return the animal ID of this persisted animal
	 */
	@Override
	public long getAnimalId() {
		return model.getAnimalId();
	}

	/**
	 * Returns the company ID of this persisted animal.
	 *
	 * @return the company ID of this persisted animal
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this persisted animal.
	 *
	 * @return the create date of this persisted animal
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this persisted animal.
	 *
	 * @return the group ID of this persisted animal
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this persisted animal.
	 *
	 * @return the modified date of this persisted animal
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this persisted animal.
	 *
	 * @return the name of this persisted animal
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the number of legs of this persisted animal.
	 *
	 * @return the number of legs of this persisted animal
	 */
	@Override
	public int getNumberOfLegs() {
		return model.getNumberOfLegs();
	}

	/**
	 * Returns the primary key of this persisted animal.
	 *
	 * @return the primary key of this persisted animal
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this persisted animal.
	 *
	 * @return the user ID of this persisted animal
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this persisted animal.
	 *
	 * @return the user name of this persisted animal
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this persisted animal.
	 *
	 * @return the user uuid of this persisted animal
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this persisted animal.
	 *
	 * @return the uuid of this persisted animal
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the animal class of this persisted animal.
	 *
	 * @param animalClass the animal class of this persisted animal
	 */
	@Override
	public void setAnimalClass(String animalClass) {
		model.setAnimalClass(animalClass);
	}

	/**
	 * Sets the animal ID of this persisted animal.
	 *
	 * @param animalId the animal ID of this persisted animal
	 */
	@Override
	public void setAnimalId(long animalId) {
		model.setAnimalId(animalId);
	}

	/**
	 * Sets the company ID of this persisted animal.
	 *
	 * @param companyId the company ID of this persisted animal
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this persisted animal.
	 *
	 * @param createDate the create date of this persisted animal
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this persisted animal.
	 *
	 * @param groupId the group ID of this persisted animal
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this persisted animal.
	 *
	 * @param modifiedDate the modified date of this persisted animal
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this persisted animal.
	 *
	 * @param name the name of this persisted animal
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the number of legs of this persisted animal.
	 *
	 * @param numberOfLegs the number of legs of this persisted animal
	 */
	@Override
	public void setNumberOfLegs(int numberOfLegs) {
		model.setNumberOfLegs(numberOfLegs);
	}

	/**
	 * Sets the primary key of this persisted animal.
	 *
	 * @param primaryKey the primary key of this persisted animal
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this persisted animal.
	 *
	 * @param userId the user ID of this persisted animal
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this persisted animal.
	 *
	 * @param userName the user name of this persisted animal
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this persisted animal.
	 *
	 * @param userUuid the user uuid of this persisted animal
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this persisted animal.
	 *
	 * @param uuid the uuid of this persisted animal
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected PersistedAnimalWrapper wrap(PersistedAnimal persistedAnimal) {
		return new PersistedAnimalWrapper(persistedAnimal);
	}

}