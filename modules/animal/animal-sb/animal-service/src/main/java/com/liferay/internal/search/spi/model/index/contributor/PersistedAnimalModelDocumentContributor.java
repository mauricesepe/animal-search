package com.liferay.internal.search.spi.model.index.contributor;

import com.liferay.model.PersistedAnimal;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = "indexer.class.name=com.liferay.model.PersistedAnimal",
	service = ModelDocumentContributor.class
)
public class PersistedAnimalModelDocumentContributor implements ModelDocumentContributor<PersistedAnimal>{
   
    @Override
    public void contribute(Document document, PersistedAnimal animal) {
        document.addText("name", animal.getName());
        document.addText("class", animal.getAnimalClass());
        document.addNumber("numberOfLegs", animal.getNumberOfLegs());
    }
}
