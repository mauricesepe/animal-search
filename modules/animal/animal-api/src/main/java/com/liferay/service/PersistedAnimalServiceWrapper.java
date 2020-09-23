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
 * Provides a wrapper for {@link PersistedAnimalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAnimalService
 * @generated
 */
public class PersistedAnimalServiceWrapper
	implements PersistedAnimalService, ServiceWrapper<PersistedAnimalService> {

	public PersistedAnimalServiceWrapper(
		PersistedAnimalService persistedAnimalService) {

		_persistedAnimalService = persistedAnimalService;
	}

	@Override
	public com.liferay.model.PersistedAnimal addPersistedAnimal(
		String name, String animalClass, int numberOfLegs,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _persistedAnimalService.addPersistedAnimal(
			name, animalClass, numberOfLegs, serviceContext);
	}

	@Override
	public com.liferay.model.PersistedAnimal deletePersistedAnimal(int animalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _persistedAnimalService.deletePersistedAnimal(animalId);
	}

	@Override
	public java.util.List<com.liferay.model.PersistedAnimal> findAll() {
		return _persistedAnimalService.findAll();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _persistedAnimalService.getOSGiServiceIdentifier();
	}

	@Override
	public PersistedAnimalService getWrappedService() {
		return _persistedAnimalService;
	}

	@Override
	public void setWrappedService(
		PersistedAnimalService persistedAnimalService) {

		_persistedAnimalService = persistedAnimalService;
	}

	private PersistedAnimalService _persistedAnimalService;

}