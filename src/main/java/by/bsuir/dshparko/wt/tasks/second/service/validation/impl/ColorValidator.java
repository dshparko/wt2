package by.bsuir.dshparko.wt.tasks.second.service.validation.impl;

import by.bsuir.dshparko.wt.tasks.second.entity.Color;
import by.bsuir.dshparko.wt.tasks.second.service.validation.CriteriaValidator;

public class ColorValidator implements CriteriaValidator {
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Color.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}
