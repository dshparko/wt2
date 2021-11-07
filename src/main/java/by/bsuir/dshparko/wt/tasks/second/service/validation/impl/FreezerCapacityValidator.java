package by.bsuir.dshparko.wt.tasks.second.service.validation.impl;

import by.bsuir.dshparko.wt.tasks.second.service.validation.CriteriaValidator;

public class FreezerCapacityValidator implements CriteriaValidator {
    private final static double MIN_CAPACITY = 0.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > MIN_CAPACITY;
        } else
            return false;
    }
}