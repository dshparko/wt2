package by.bsuir.dshparko.wt.tasks.second.dao.applianceMatcher.impl;

import by.bsuir.dshparko.wt.tasks.second.dao.applianceMatcher.ApplianceMatcherFactory;
import by.bsuir.dshparko.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.dshparko.wt.tasks.second.entity.Appliance;
import by.bsuir.dshparko.wt.tasks.second.entity.CPU;
import by.bsuir.dshparko.wt.tasks.second.entity.Laptop;
import by.bsuir.dshparko.wt.tasks.second.entity.OS;
import by.bsuir.dshparko.wt.tasks.second.entity.criteria.SearchCriteria;

public class LaptopMatcher extends ApplianceMatcherFactory {
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Laptop laptop = (Laptop) appliance;

        return switch (SearchCriteria.LaptopWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> laptop.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> laptop.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> laptop.getPrice() == (double) value;
            case NAME -> ApplianceTagName.LAPTOP.equals(value);
            case BATTERY_CAPACITY -> laptop.getBatteryCapacity() == (double) value;
            case OS -> laptop.getOs().equals(OS.valueOf((String) value));
            case MEMORY_ROM -> laptop.getMemoryRom() == (double) value;
            case CPU -> laptop.getCpu().equals(CPU.valueOf((String) value));
            case DISPLAY_INCHES -> laptop.getDisplayInches() == (double) value;
        };
    }
}
