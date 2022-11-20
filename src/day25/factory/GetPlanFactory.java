package day25.factory;

import day25.factory.model.CommercialPlan;
import day25.factory.model.FamilyPlan;
import day25.factory.model.InstitutionalPlan;
import day25.factory.model.Plan;

public class GetPlanFactory {

    public Plan getPlan(String planType) {
        switch (planType) {
            case "FAMILY_PLAN" -> {
                return new FamilyPlan();

            }
            case "COMMERCIAL_PLAN" -> {
                return new CommercialPlan();

            }
            case "INSTITUTIONAL_PLAN" -> {
                return new InstitutionalPlan();

            }
        }
        return null;
    }

}
