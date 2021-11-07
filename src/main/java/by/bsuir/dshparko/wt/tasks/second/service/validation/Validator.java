package by.bsuir.dshparko.wt.tasks.second.service.validation;

import by.bsuir.dshparko.wt.tasks.second.entity.criteria.Criteria;

public class Validator {
    public static boolean isCriteriaValid(Criteria criteria) {
        if (criteria == null) {
            return false;
        }

        return criteria.getCriteriaMap().entrySet().stream().allMatch(
                entry -> CriteriaValidatorFactory.getInstance()
                        .getValidator(entry.getKey())
                        .isCriteriaValid(entry.getValue()));
    }
}
