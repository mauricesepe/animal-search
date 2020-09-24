package com.liferay.headless.animal.internal.resource.v1_0;

import javax.validation.constraints.NotNull;
import javax.ws.rs.core.MultivaluedMap;

import com.liferay.headless.animal.dto.v1_0.Animal;
import com.liferay.headless.animal.internal.odata.entity.v1_0.AnimalEntityModel;
import com.liferay.headless.animal.resource.v1_0.AnimalResource;
import com.liferay.model.PersistedAnimal;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.util.SearchUtil;
import com.liferay.service.PersistedAnimalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;


/**
 * @author Maurice Sepe
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/animal.properties",
	scope = ServiceScope.PROTOTYPE, service = AnimalResource.class
)
public class AnimalResourceImpl extends BaseAnimalResourceImpl {

    private AnimalEntityModel _animalEntityModel = new AnimalEntityModel();

    @Override
    public EntityModel getEntityModel(MultivaluedMap multivaluedMap) throws Exception {
      return _animalEntityModel;
    }

    @Override
    public Page<Animal> getAnimalsPage(String search, Filter filter, Pagination pagination, Sort[] sorts) throws Exception {
        Page<Animal> results = SearchUtil.search(null, booleanQuery -> {}, 
                filter, PersistedAnimal.class, search, pagination, 
                queryConfig -> queryConfig.setSelectedFieldNames(Field.ENTRY_CLASS_PK),
                searchContext -> searchContext.setCompanyId(contextCompany.getCompanyId()), 
                sorts, document -> _toAnimal(_persisteAnimalService.fetchPersistedAnimal(GetterUtil.getLong(document.get(Field.ENTRY_CLASS_PK)))));
        return results;
    }

    @Override
    public Animal postAnimal(@NotNull Animal animal) throws Exception {
        PersistedAnimal a = _persisteAnimalService.addPersistedAnimal(animal.getName(), animal.getAnimalClass(), animal.getNumberOfLegs(), null);
        return _toAnimal(a);
    }

    @Override
    public void deleteAnimal(@NotNull String animalId) throws Exception {
        _persisteAnimalService.deletePersistedAnimal(Long.parseLong(animalId));
    }

    protected Animal _toAnimal(PersistedAnimal animal) {
        return new Animal() {{
            id = animal.getAnimalId();
            name = animal.getName();
            animalClass = animal.getAnimalClass();
            numberOfLegs = animal.getNumberOfLegs();
        }};
    }

    @Reference
    PersistedAnimalService _persisteAnimalService;
}