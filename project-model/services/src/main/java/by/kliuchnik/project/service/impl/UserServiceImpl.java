package by.kliuchnik.project.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.kliuchnik.project.dataaccess.CustomerDao;
import by.kliuchnik.project.dataaccess.UserDao;
import by.kliuchnik.project.dataaccess.filters.CustomerFilter;
import by.kliuchnik.project.datamodel.Customer;
import by.kliuchnik.project.datamodel.User;
import by.kliuchnik.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	@Inject
	private UserDao userDao;
	@Inject
	private CustomerDao customerDao;
	

	@Override
	public void register(User user, Customer customer) {
		customer.setUser(user);
		userDao.insert(user);
		customerDao.insert(customer);

		LOGGER.info("User regirstred: {}",user, customer);
	}

	@Override
	public User getUser(Long id) {
		
		LOGGER.info("User select: {}", userDao.get(id));
		
		return userDao.get(id);
	}

	@Override
	public Customer getCustomer(Long id) {
		LOGGER.info("Customer select: {}", customerDao.get(id));
		return customerDao.get(id);
	}

	@Override
	public void update(User user) {
		LOGGER.info("User update, new and old: {}", user, userDao.get(user.getId()));
		userDao.update(user);

	}

	@Override
	public void update(Customer customer) {
		LOGGER.info("Customer update, new and old: {}", customer, customerDao.get(customer.getId()));
		customerDao.update(customer);

	}
	@Override
	public void delete(Long id) {
		LOGGER.info("User delete: {}", userDao.get(id), customerDao.get(id));
		
		customerDao.delete(id);
		userDao.delete(id);

	}

	@Override
	public List<Customer> find(CustomerFilter userFilter) {
		
		LOGGER.info("User find by filter: {}", userFilter);

		return customerDao.find(userFilter);
	}

	@Override
	public List<User> getAll() {
		
		LOGGER.info("User getAll: {}", "Alls users");
		
		return userDao.getAll();
	}
}
