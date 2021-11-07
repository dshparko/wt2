package by.bsuir.dshparko.wt.tasks.second.dao;

import by.bsuir.dshparko.wt.tasks.second.entity.Appliance;
import by.bsuir.dshparko.wt.tasks.second.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
    List<Appliance> find(Criteria criteria) throws DAOException;
    boolean add(String applianceName, Appliance appliance) throws DAOException;

}
