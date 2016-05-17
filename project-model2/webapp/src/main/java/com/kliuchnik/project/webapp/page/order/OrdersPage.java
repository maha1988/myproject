package com.kliuchnik.project.webapp.page.order;

import javax.inject.Inject;

import com.kliuchnik.project.service.OrderService;
import com.kliuchnik.project.webapp.page.AbstractPage;

public class OrdersPage extends AbstractPage {
	 @Inject
	    private OrderService orderService;

	    public OrdersPage() {
	        super();

	        System.out.print(orderService);
	    }
}
