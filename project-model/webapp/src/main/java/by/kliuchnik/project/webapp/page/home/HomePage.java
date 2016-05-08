package by.kliuchnik.project.webapp.page.home;

import org.apache.wicket.markup.html.link.Link;

import by.kliuchnik.project.webapp.page.AbstractPage;
import by.kliuchnik.project.webapp.page.product.ProductPage;

public class HomePage extends AbstractPage {

    public HomePage() {
        super();
        add(new Link("linkproduct") {
            @Override
            public void onClick() {
                setResponsePage(new ProductPage());
            }
        });
    }

}
