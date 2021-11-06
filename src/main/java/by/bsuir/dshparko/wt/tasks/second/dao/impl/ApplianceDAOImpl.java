package by.bsuir.dshparko.wt.tasks.second.dao.impl;

import by.bsuir.dshparko.wt.tasks.second.dao.ApplianceDAO;
import by.bsuir.dshparko.wt.tasks.second.dao.DAOException;
import by.bsuir.dshparko.wt.tasks.second.entity.Appliance;
import by.bsuir.dshparko.wt.tasks.second.entity.criteria.Criteria;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> appliances = new ArrayList<>();
        try {

        } catch (EnumConstantNotPresentException | IllegalArgumentException e) {

        }
        return appliances;
    }


    @Override
    public boolean add(String applianceName, Appliance appliance)  {
        try {

        } catch (EnumConstantNotPresentException e) {

        }
        return true;
    }


    private Document getDocument(String fileName) throws DAOException {
        Document document;
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            document = documentBuilder.parse(Objects.requireNonNull(getClass().getClassLoader().getResource(fileName)).getFile());
            document.getDocumentElement().normalize();
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new DAOException(e);
        }
        return document;
    }
}
