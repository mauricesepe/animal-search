package com.liferay.headless.animal.internal.graphql.servlet.v1_0;

import com.liferay.headless.animal.internal.graphql.mutation.v1_0.Mutation;
import com.liferay.headless.animal.internal.graphql.query.v1_0.Query;
import com.liferay.headless.animal.resource.v1_0.AnimalResource;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author Maurice Sepe
 * @generated
 */
@Component(immediate = true, service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setAnimalResourceComponentServiceObjects(
			_animalResourceComponentServiceObjects);

		Query.setAnimalResourceComponentServiceObjects(
			_animalResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/animal-headless-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<AnimalResource>
		_animalResourceComponentServiceObjects;

}