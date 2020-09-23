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

package com.liferay.service.impl;

import java.util.List;

import com.liferay.model.PersistedAnimal;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.service.base.PersistedAnimalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the persisted animal remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.service.PersistedAnimalService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAnimalServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=animal",
		"json.web.service.context.path=PersistedAnimal"
	},
	service = AopService.class
)
public class PersistedAnimalServiceImpl extends PersistedAnimalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.service.PersistedAnimalServiceUtil</code> to access the persisted animal remote service.
	 */

    public List<PersistedAnimal> findAll() {
        return persistedAnimalLocalService.findAll();
    }

    public PersistedAnimal addPersistedAnimal(String name, String animalClass, int numberOfLegs, ServiceContext serviceContext) {
        return persistedAnimalLocalService.addPersistedAnimal(name, animalClass, numberOfLegs, serviceContext);
    }

    public PersistedAnimal deletePersistedAnimal(int animalId) throws PortalException {
        return persistedAnimalLocalService.deletePersistedAnimal(animalId);
    }
}