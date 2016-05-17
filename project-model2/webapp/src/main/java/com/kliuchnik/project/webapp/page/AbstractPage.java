package com.kliuchnik.project.webapp.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.kliuchnik.project.webapp.component.menu.MenuPanel;
import com.kliuchnik.project.webapp.component.menu.MenuPanelLoggedUser;
import com.kliuchnik.project.webapp.page.product.ProductsPage;

public abstract class AbstractPage extends WebPage {

	 public AbstractPage() {
	        super();
	    }

	    public AbstractPage(PageParameters parameters) {
	        super(parameters);
	    }

	    @Override
	    protected void onInitialize() {
	        super.onInitialize();

	        if (getPage().getClass().equals(ProductsPage.class)) {
	            add(new MenuPanelLoggedUser("menu-panel"));
	        } else {
	            add(new MenuPanel("menu-panel"));
	        }

	    }

	}