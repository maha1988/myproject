package com.kliuchnik.project.webapp.page.customer;

import javax.inject.Inject;

import com.kliuchnik.project.service.UserService;
import com.kliuchnik.project.webapp.page.AbstractPage;

public class CustomersPage extends AbstractPage {
	 @Inject
	    private UserService userService;

	    public CustomersPage() {
	        super();

	        System.out.print(userService);
	    }
}
