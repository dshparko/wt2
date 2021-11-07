package by.bsuir.dshparko.wt.tasks.second.dao.appliance_xml_factory;

import by.bsuir.dshparko.wt.tasks.second.dao.appliance_xml_factory.impl.FreezerXMLFactory;
import by.bsuir.dshparko.wt.tasks.second.dao.appliance_xml_factory.impl.LaptopXMLFactory;
import by.bsuir.dshparko.wt.tasks.second.dao.appliance_xml_factory.impl.OvenXMLFactory;
import by.bsuir.dshparko.wt.tasks.second.dao.appliance_xml_factory.impl.TabletPCXMLFactory;
import by.bsuir.dshparko.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.dshparko.wt.tasks.second.entity.Appliance;
import by.bsuir.dshparko.wt.tasks.second.entity.Freezer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public abstract class ApplianceXMLFactory {
    public abstract Node createApplianceXML(Document document, Appliance appliance);

    protected final Node createElement(Document document, String fieldTagName, Object value) {
        Element node = document.createElement(fieldTagName.toLowerCase().replace('_', '-'));
        node.appendChild(document.createTextNode(String.valueOf(value)));
        return node;
    }

    public static ApplianceXMLFactory getApplianceXMLFactory(String applianceName) throws EnumConstantNotPresentException {
        try {
            return switch (ApplianceTagName.valueOf(applianceName)) {
                case LAPTOP -> new LaptopXMLFactory();
                case OVEN -> new OvenXMLFactory();
                case TABLET_PC -> new TabletPCXMLFactory();
                case FREEZER -> new FreezerXMLFactory();
            };
        } catch (IllegalArgumentException e) {
            throw new EnumConstantNotPresentException(ApplianceTagName.class, applianceName);
        }

    }
}
