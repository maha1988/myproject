package com.kliuchnik.project.dataaccess;

import java.util.List;

import com.kliuchnik.project.dataaccess.filters.CustomerFilter;
import com.kliuchnik.project.datamodel.Customer;
import com.kliuchnik.project.datamodel.User;


public interface CustomerDao extends AbstractDao<Customer, Long> {
	List<Customer> find(CustomerFilter filter);
}
