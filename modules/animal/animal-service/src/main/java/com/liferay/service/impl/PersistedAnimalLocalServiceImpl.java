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
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.service.base.PersistedAnimalLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the persisted animal local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.service.PersistedAnimalLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersistedAnimalLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.model.PersistedAnimal",
	service = AopService.class
)
public class PersistedAnimalLocalServiceImpl
	extends PersistedAnimalLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.service.PersistedAnimalLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.service.PersistedAnimalLocalServiceUtil</code>.
	 */

    public List<PersistedAnimal> findAll() {
        return persistedAnimalPersistence.findAll();
    }

    @Indexable(type = IndexableType.REINDEX)
    public PersistedAnimal addPersistedAnimal(String name, String animalClass, int numberOfLegs, ServiceContext serviceContext) {
        long animalId = counterLocalService.increment(PersistedAnimal.class.getName());
        PersistedAnimal persistedAnimal = createPersistedAnimal(animalId);
        persistedAnimal.setName(name);
        persistedAnimal.setAnimalClass(animalClass);
        persistedAnimal.setNumberOfLegs(numberOfLegs);
        return super.addPersistedAnimal(persistedAnimal);
    }

    @Indexable(type = IndexableType.DELETE)
    public PersistedAnimal deletePersistedAnimal(long animalId) throws PortalException {
        return super.deletePersistedAnimal(animalId);
    }
}