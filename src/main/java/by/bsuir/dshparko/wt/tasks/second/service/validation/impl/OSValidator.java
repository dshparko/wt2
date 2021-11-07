package by.bsuir.dshparko.wt.tasks.second.service.validation.impl;

import by.bsuir.dshparko.wt.tasks.second.entity.OS;
import by.bsuir.dshparko.wt.tasks.second.service.validation.CriteriaValidator;

public class OSValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            OS.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
