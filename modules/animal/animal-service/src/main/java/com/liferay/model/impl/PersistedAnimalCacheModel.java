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

package com.liferay.model.impl;

import com.liferay.model.PersistedAnimal;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PersistedAnimal in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PersistedAnimalCacheModel
	implements CacheModel<PersistedAnimal>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PersistedAnimalCacheModel)) {
			return false;
		}

		PersistedAnimalCacheModel persistedAnimalCacheModel =
			(PersistedAnimalCacheModel)object;

		if (animalId == persistedAnimalCacheModel.animalId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, animalId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", animalId=");
		sb.append(animalId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", animalClass=");
		sb.append(animalClass);
		sb.append(", numberOfLegs=");
		sb.append(numberOfLegs);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PersistedAnimal toEntityModel() {
		PersistedAnimalImpl persistedAnimalImpl = new PersistedAnimalImpl();

		if (uuid == null) {
			persistedAnimalImpl.setUuid("");
		}
		else {
			persistedAnimalImpl.setUuid(uuid);
		}

		persistedAnimalImpl.setAnimalId(animalId);
		persistedAnimalImpl.setGroupId(groupId);
		persistedAnimalImpl.setCompanyId(companyId);
		persistedAnimalImpl.setUserId(userId);

		if (userName == null) {
			persistedAnimalImpl.setUserName("");
		}
		else {
			persistedAnimalImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			persistedAnimalImpl.setCreateDate(null);
		}
		else {
			persistedAnimalImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			persistedAnimalImpl.setModifiedDate(null);
		}
		else {
			persistedAnimalImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			persistedAnimalImpl.setName("");
		}
		else {
			persistedAnimalImpl.setName(name);
		}

		if (animalClass == null) {
			persistedAnimalImpl.setAnimalClass("");
		}
		else {
			persistedAnimalImpl.setAnimalClass(animalClass);
		}

		persistedAnimalImpl.setNumberOfLegs(numberOfLegs);

		persistedAnimalImpl.resetOriginalValues();

		return persistedAnimalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		animalId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		animalClass = objectInput.readUTF();

		numberOfLegs = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(animalId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (animalClass == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(animalClass);
		}

		objectOutput.writeInt(numberOfLegs);
	}

	public String uuid;
	public long animalId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String animalClass;
	public int numberOfLegs;

}