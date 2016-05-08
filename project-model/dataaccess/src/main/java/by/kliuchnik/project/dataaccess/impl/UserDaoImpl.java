package by.kliuchnik.project.dataaccess.impl;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.jpa.criteria.OrderImpl;
import org.springframework.stereotype.Repository;

import by.kliuchnik.project.dataaccess.UserDao;
import by.kliuchnik.project.dataaccess.filters.SkladFilter;
import by.kliuchnik.project.dataaccess.filters.CustomerFilter;
import by.kliuchnik.project.datamodel.Customer;
import by.kliuchnik.project.datamodel.Customer_;
import by.kliuchnik.project.datamodel.Sklad;
import by.kliuchnik.project.datamodel.Sklad_;
import by.kliuchnik.project.datamodel.User;
import by.kliuchnik.project.datamodel.User_;

@Repository
public class UserDaoImpl extends AbstractDaoImpl<User, Long> implements UserDao {

	protected UserDaoImpl() {
		super(User.class);
		
	}
	 
	 	 	  
}
