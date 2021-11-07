package by.bsuir.dshparko.wt.tasks.second.service.validation.impl;

import by.bsuir.dshparko.wt.tasks.second.entity.CPU;
import by.bsuir.dshparko.wt.tasks.second.service.validation.CriteriaValidator;

public class CPUValidator implements CriteriaValidator {


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

