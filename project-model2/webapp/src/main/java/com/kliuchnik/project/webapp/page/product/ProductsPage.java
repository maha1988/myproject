package com.kliuchnik.project.webapp.page.product;

import javax.inject.Inject;

import com.kliuchnik.project.service.ProductService;
import com.kliuchnik.project.webapp.page.AbstractPage;

public class ProductsPage extends AbstractPage {
	 @Inject
	    private ProductService productService;

	    public ProductsPage() {
	        super();

	        System.out.print(productService);
	    }
}
