package com.liferay.internal.search.spi.model.index.contributor;

import com.liferay.model.PersistedAnimal;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.batch.BatchIndexingActionable;
import com.liferay.portal.search.batch.DynamicQueryBatchIndexingActionableFactory;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.index.contributor.helper.IndexerWriterMode;
import com.liferay.portal.search.spi.model.index.contributor.helper.ModelIndexerWriterDocumentHelper;
import com.liferay.service.PersistedAnimalLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true,
	property = "indexer.class.name=com.liferay.model.PersistedAnimal",
	service = ModelIndexerWriterContributor.class
)
public class PersistedAnimalModelIndexerWriterContributor implements ModelIndexerWriterContributor<PersistedAnimal> {

    @Override
    public void customize(BatchIndexingActionable batchIndexingActionable, ModelIndexerWriterDocumentHelper modelIndexerWriterDocumentHelper) {
		batchIndexingActionable.setPerformActionMethod((PersistedAnimal animal) -> {
			Document document = modelIndexerWriterDocumentHelper.getDocument(animal);
			batchIndexingActionable.addDocuments(document);
		});
    }
    
    @Override
	public BatchIndexingActionable getBatchIndexingActionable() {
		return _dynamicQueryBatchIndexingActionableFactory.getBatchIndexingActionable(_persistedAnimalLocalservice.getIndexableActionableDynamicQuery());
	}

    @Override
	public long getCompanyId(PersistedAnimal animal) {
		return animal.getCompanyId();
	}

    @Override
	public IndexerWriterMode getIndexerWriterMode(PersistedAnimal animal) {
		return IndexerWriterMode.UPDATE;
    }

    @Reference
    private PersistedAnimalLocalService _persistedAnimalLocalservice;

    @Reference
	private DynamicQueryBatchIndexingActionableFactory _dynamicQueryBatchIndexingActionableFactory;
}
