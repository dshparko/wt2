package by.bsuir.dshparko.wt.tasks.second.service;

import by.bsuir.dshparko.wt.tasks.second.dao.DAOException;
import by.bsuir.dshparko.wt.tasks.second.entity.Appliance;
import by.bsuir.dshparko.wt.tasks.second.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {


    List<Appliance> find(Criteria criteria) throws DAOException, ServiceException;

    boolean add(String applianceName, Appliance appliance) throws DAOException, ServiceException;

}