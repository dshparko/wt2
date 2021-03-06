package by.bsuir.dshparko.wt.tasks.second.service.validation.impl;

import by.bsuir.dshparko.wt.tasks.second.service.validation.CriteriaValidator;
/**
 * HeightValidator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class HeightValidator implements CriteriaValidator {
    private final static double MIN_HEIGHT = 0.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > MIN_HEIGHT;
        } else {
            return false;
        }
    }
}
