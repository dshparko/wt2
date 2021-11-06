package by.bsuir.dshparko.wt.tasks.second.dao.creator;

import by.bsuir.dshparko.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.dshparko.wt.tasks.second.dao.creator.impl.FreezerCreator;
import by.bsuir.dshparko.wt.tasks.second.dao.creator.impl.LaptopCreator;
import by.bsuir.dshparko.wt.tasks.second.dao.creator.impl.OvenCreator;
import by.bsuir.dshparko.wt.tasks.second.dao.creator.impl.TabletPCCreator;
import by.bsuir.dshparko.wt.tasks.second.entity.Appliance;
import org.w3c.dom.NodeList;

public abstract class ApplianceCreator {
    public abstract Appliance createAppliance(NodeList nodeList);

    public static ApplianceCreator getApplianceFactory(String applianceName) throws EnumConstantNotPresentException {
        try {
            return switch (ApplianceTagName.valueOf(applianceName)) {
                case LAPTOP -> new LaptopCreator();
                case OVEN -> new OvenCreator();
                case TABLET_PC -> new TabletPCCreator();
                case FREEZER -> new FreezerCreator();
            };
        } catch (IllegalArgumentException e) {
            throw new EnumConstantNotPresentException(ApplianceTagName.class, applianceName);
        }
    }
}
