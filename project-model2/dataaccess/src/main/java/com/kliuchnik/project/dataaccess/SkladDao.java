package com.kliuchnik.project.dataaccess;

import java.util.List;

import com.kliuchnik.project.dataaccess.filters.SkladFilter;
import com.kliuchnik.project.datamodel.Sklad;


public interface SkladDao extends AbstractDao<Sklad, Long> {
	 List<Sklad> find(SkladFilter skladFilter);
}
