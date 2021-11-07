package by.bsuir.dshparko.wt.tasks.second.dao.applianceMatcher.impl;


import by.bsuir.dshparko.wt.tasks.second.dao.applianceMatcher.ApplianceMatcherFactory;
import by.bsuir.dshparko.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.dshparko.wt.tasks.second.entity.Appliance;
import by.bsuir.dshparko.wt.tasks.second.entity.Freezer;
import by.bsuir.dshparko.wt.tasks.second.entity.criteria.SearchCriteria;

public class FreezerMatcher  extends ApplianceMatcherFactory {

    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Freezer freezer = (Freezer) appliance;

        return switch (SearchCriteria.FreezerWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> freezer.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> freezer.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> freezer.getPrice() == (double) value;
            case NAME -> ApplianceTagName.FREEZER.equals(value);
            case DEPTH -> freezer.getDepth() == (double) value;
            case HEIGHT -> freezer.getHeight() == (double) value;
            case WIDTH -> freezer.getWidth() == (double) value;
            case FREEZER_CAPACITY -> freezer.getFreezerCapacity() == (double) value;
        };
    }
}
