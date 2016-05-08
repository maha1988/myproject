package com.kliuchnik.project.dataaccess;

import java.util.List;

import com.kliuchnik.project.dataaccess.filters.CustomerFilter;
import com.kliuchnik.project.datamodel.User;

public interface UserDao extends AbstractDao<User, Long> {
	
}