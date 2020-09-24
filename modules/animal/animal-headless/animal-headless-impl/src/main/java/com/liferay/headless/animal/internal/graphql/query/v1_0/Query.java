package com.liferay.headless.animal.internal.graphql.query.v1_0;

import com.liferay.headless.animal.dto.v1_0.Animal;
import com.liferay.headless.animal.resource.v1_0.AnimalResource;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Maurice Sepe
 * @generated
 */
@Generated("")
public class Query {

	public static void setAnimalResourceComponentServiceObjects(
		ComponentServiceObjects<AnimalResource>
			animalResourceComponentServiceObjects) {

		_animalResourceComponentServiceObjects =
			animalResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {animals(filter: ___, page: ___, pageSize: ___, search: ___, sorts: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(
		description = "Retrieve the list of animals. Results can be paginated, filtered, searched and sorted."
	)
	public AnimalPage animals(
			@GraphQLName("search") String search,
			@GraphQLName("filter") String filterString,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_animalResourceComponentServiceObjects,
			this::_populateResourceContext,
			animalResource -> new AnimalPage(
				animalResource.getAnimalsPage(
					search,
					_filterBiFunction.apply(animalResource, filterString),
					Pagination.of(page, pageSize),
					_sortsBiFunction.apply(animalResource, sortsString))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {animal(animalId: ___){id, name, animalClass, numberOfLegs}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Retrieves the animal via its ID")
	public Animal animal(@GraphQLName("animalId") String animalId)
		throws Exception {

		return _applyComponentServiceObjects(
			_animalResourceComponentServiceObjects,
			this::_populateResourceContext,
			animalResource -> animalResource.getAnimal(animalId));
	}

	@GraphQLName("AnimalPage")
	public class AnimalPage {

		public AnimalPage(Page animalPage) {
			actions = animalPage.getActions();

			items = animalPage.getItems();
			lastPage = animalPage.getLastPage();
			page = animalPage.getPage();
			pageSize = animalPage.getPageSize();
			totalCount = animalPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<Animal> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

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
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}