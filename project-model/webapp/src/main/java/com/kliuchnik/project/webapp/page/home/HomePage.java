package com.kliuchnik.project.webapp.page.home;

import org.apache.wicket.markup.html.link.Link;

import com.kliuchnik.project.webapp.page.AbstractPage;
import com.kliuchnik.project.webapp.page.customer.CustomerPage;
import com.kliuchnik.project.webapp.page.order.OrderPage;
import com.kliuchnik.project.webapp.page.product.ProductPage;
import com.kliuchnik.project.webapp.page.sklad.SkladPage;

public class HomePage extends AbstractPage {

    public HomePage() {
        super();
        add(new Link("linkproduct") {
            @Override
            public void onClick() {
                setResponsePage(new ProductPage());                
                
            }
            
            
        });
        add(new Link("linksklad") {
            @Override
            public void onClick() {
                setResponsePage(new SkladPage());                
                
            }
            
            
        });
        add(new Link("linkorder") {
            @Override
            public void onClick() {
                setResponsePage(new OrderPage());                
                
            }
            
            
        });
        add(new Link("linkcustomer") {
            @Override
            public void onClick() {
                setResponsePage(new CustomerPage());                
                
            }
            
            
        });
    }
    

}
