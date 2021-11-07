package by.bsuir.dshparko.wt.tasks.second.service.impl;

import by.bsuir.dshparko.wt.tasks.second.dao.ApplianceDAO;
import by.bsuir.dshparko.wt.tasks.second.dao.DAOException;
import by.bsuir.dshparko.wt.tasks.second.dao.DAOFactory;
import by.bsuir.dshparko.wt.tasks.second.entity.Appliance;
import by.bsuir.dshparko.wt.tasks.second.entity.criteria.Criteria;
import by.bsuir.dshparko.wt.tasks.second.service.ApplianceService;
import by.bsuir.dshparko.wt.tasks.second.service.ServiceException;
import by.bsuir.dshparko.wt.tasks.second.service.constant.ServiceExceptionMessage;
import by.bsuir.dshparko.wt.tasks.second.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {


    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException, DAOException {
        if (!Validator.isCriteriaValid(criteria)) {
            throw new ServiceException(ServiceExceptionMessage.INVALID_CRITERIA_EXCEPTION_MSG.getMessage());
        }

        List<Appliance> appliances;
        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();
        appliances = applianceDAO.find(criteria);
        return appliances;
    }


    @Override
    public boolean add(String applianceName, Appliance appliance) throws DAOException, ServiceException {
        if (applianceName.isEmpty() || appliance == null) {
            throw new ServiceException(ServiceExceptionMessage.INVALID_CRITERIA_EXCEPTION_MSG.getMessage());
        }

        boolean isApplianceAdded;
        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();
        isApplianceAdded = applianceDAO.add(applianceName, appliance);
        return isApplianceAdded;
    }

}
