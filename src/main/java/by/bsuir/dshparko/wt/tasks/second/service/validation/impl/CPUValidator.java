package by.bsuir.dshparko.wt.tasks.second.service.validation.impl;

import by.bsuir.dshparko.wt.tasks.second.entity.CPU;
import by.bsuir.dshparko.wt.tasks.second.service.validation.CriteriaValidator;
/**
 * CPUValidator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class CPUValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            CPU.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}

