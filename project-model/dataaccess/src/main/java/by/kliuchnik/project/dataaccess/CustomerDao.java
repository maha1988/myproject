package by.kliuchnik.project.dataaccess;

import java.util.List;

import by.kliuchnik.project.dataaccess.filters.CustomerFilter;
import by.kliuchnik.project.datamodel.Customer;
import by.kliuchnik.project.datamodel.User;


public interface CustomerDao extends AbstractDao<Customer, Long> {
	List<Customer> find(CustomerFilter filter);
}
