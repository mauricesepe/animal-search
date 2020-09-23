package com.liferay.internal.search.spi.model.result.contributor;

import java.util.Locale;

import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = "indexer.class.name=com.liferay.model.PersistedAnimal",
	service = ModelSummaryContributor.class
)
public class PersistedAnimalModelSummaryContributor implements ModelSummaryContributor {
    @Override
	public Summary getSummary(
        
        Document document, Locale locale, String snippet) {
		Summary summary = new Summary(
				document.get("name"),
				document.get("class"));
		summary.setMaxContentLength(200);
		return summary;
	}
}
