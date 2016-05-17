package com.kliuchnik.project.webapp.page.sklad;

import javax.inject.Inject;

import com.kliuchnik.project.service.SkladService;
import com.kliuchnik.project.webapp.page.AbstractPage;

public class SkladPage extends AbstractPage {
	@Inject
    private SkladService skladService;

    public SkladPage() {
        super();

        System.out.print(skladService);
    }
}
