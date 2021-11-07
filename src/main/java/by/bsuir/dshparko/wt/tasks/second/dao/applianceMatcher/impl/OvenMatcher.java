package by.bsuir.dshparko.wt.tasks.second.dao.applianceMatcher.impl;

import by.bsuir.dshparko.wt.tasks.second.dao.applianceMatcher.ApplianceMatcherFactory;
import by.bsuir.dshparko.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.dshparko.wt.tasks.second.entity.Appliance;
import by.bsuir.dshparko.wt.tasks.second.entity.Oven;
import by.bsuir.dshparko.wt.tasks.second.entity.criteria.SearchCriteria;


public class OvenMatcher extends ApplianceMatcherFactory {
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Oven oven = (Oven) appliance;

        return switch (SearchCriteria.OvenWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> oven.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> oven.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> oven.getPrice() == (double) value;
            case NAME -> ApplianceTagName.OVEN.equals(value);
            case POWER_CONSUMPTION -> oven.getPowerConsumption() == (double) value;
            case WEIGHT -> oven.getWeight() == (double) value;
            case CAPACITY -> oven.getCapacity() == (double) value;
            case DEPTH -> oven.getDepth() == (double) value;
            case HEIGHT -> oven.getHeight() == (double) value;
            case WIDTH -> oven.getWidth() == (double) value;
        };
    }
}