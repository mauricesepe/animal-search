package com.liferay.headless.animal.internal.graphql.mutation.v1_0;

import com.liferay.headless.animal.dto.v1_0.Animal;
import com.liferay.headless.animal.resource.v1_0.AnimalResource;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Maurice Sepe
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setAnimalResourceComponentServiceObjects(
		ComponentServiceObjects<AnimalResource>
			animalResourceComponentServiceObjects) {

		_animalResourceComponentServiceObjects =
			animalResourceComponentServiceObjects;
	}

	@GraphQLField(description = "Create a new animal entity.")
	public Animal createAnimal(@GraphQLName("animal") Animal animal)
		throws Exception {

		return _applyComponentServiceObjects(
			_animalResourceComponentServiceObjects,
			this::_populateResourceContext,
			animalResource -> animalResource.postAnimal(animal));
	}

	@GraphQLField
	public Response createAnimalBatch(
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_animalResourceComponentServiceObjects,
			this::_populateResourceContext,
			animalResource -> animalResource.postAnimalBatch(
				callbackURL, object));
	}

	@GraphQLField(description = "Deletes the target animal entity.")
	public boolean deleteAnimal(@GraphQLName("animalId") String animalId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_animalResourceComponentServiceObjects,
			this::_populateResourceContext,
			animalResource -> animalResource.deleteAnimal(animalId));

		return true;
	}

	@GraphQLField
	public Response deleteAnimalBatch(
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_animalResourceComponentServiceObjects,
			this::_populateResourceContext,
			animalResource -> animalResource.deleteAnimalBatch(
				callbackURL, object));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(AnimalResource animalResource)
		throws Exception {

		animalResource.setContextAcceptLanguage(_acceptLanguage);
		animalResource.setContextCompany(_company);
		animalResource.setContextHttpServletRequest(_httpServletRequest);
		animalResource.setContextHttpServletResponse(_httpServletResponse);
		animalResource.setContextUriInfo(_uriInfo);
		animalResource.setContextUser(_user);
		animalResource.setGroupLocalService(_groupLocalService);
		animalResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<AnimalResource>
		_animalResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}