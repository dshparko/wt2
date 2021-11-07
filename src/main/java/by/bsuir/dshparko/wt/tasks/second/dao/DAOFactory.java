package by.bsuir.dshparko.wt.tasks.second.dao;

import by.bsuir.dshparko.wt.tasks.second.dao.impl.ApplianceDAOImpl;

public class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();

    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    private DAOFactory() {
    }

    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }
}
