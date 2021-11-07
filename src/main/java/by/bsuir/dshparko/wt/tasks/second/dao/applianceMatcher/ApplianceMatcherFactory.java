package by.bsuir.dshparko.wt.tasks.second.dao.applianceMatcher;

import by.bsuir.dshparko.wt.tasks.second.dao.applianceMatcher.impl.FreezerMatcher;
import by.bsuir.dshparko.wt.tasks.second.dao.applianceMatcher.impl.LaptopMatcher;
import by.bsuir.dshparko.wt.tasks.second.dao.applianceMatcher.impl.OvenMatcher;
import by.bsuir.dshparko.wt.tasks.second.dao.applianceMatcher.impl.TabletPCMatcher;
import by.bsuir.dshparko.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.dshparko.wt.tasks.second.entity.Appliance;

public abstract class ApplianceMatcherFactory {
    public abstract boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value);

    public static ApplianceMatcherFactory getMatcher(String applianceName) throws EnumConstantNotPresentException {
        try {
            return switch (ApplianceTagName.valueOf(applianceName)) {
                case LAPTOP -> new LaptopMatcher();
                case OVEN -> new OvenMatcher();
                case TABLET_PC -> new TabletPCMatcher();
                case FREEZER -> new FreezerMatcher();
            };
        } catch (IllegalArgumentException e) {
            throw new EnumConstantNotPresentException(ApplianceTagName.class, applianceName);
        }
    }
}
