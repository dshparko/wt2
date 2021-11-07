package by.bsuir.dshparko.wt.tasks.second.service.validation.impl;

import by.bsuir.dshparko.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.dshparko.wt.tasks.second.service.validation.CriteriaValidator;
/**
 * ApplianceNameValidator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class ApplianceNameValidator implements CriteriaValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            ApplianceTagName.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}
