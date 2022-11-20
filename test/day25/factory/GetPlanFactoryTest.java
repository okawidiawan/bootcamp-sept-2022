package day25.factory;

import day25.factory.model.CommercialPlan;
import day25.factory.model.FamilyPlan;
import day25.factory.model.InstitutionalPlan;
import day25.factory.model.Plan;
import org.junit.Test;
import static org.junit.Assert.*;

public class GetPlanFactoryTest {

    private GetPlanFactory factory = new GetPlanFactory();

    @Test
    public void testGetPlan_family_plan() {
        String planType = "FAMILY_PLAN";
        Plan result = factory.getPlan(planType);
        assertTrue(result instanceof FamilyPlan);
    }

    @Test
    public void testGetPlan_commercial_plan() {
        String planType = "COMMERCIAL_PLAN";
        Plan result = factory.getPlan(planType);
        assertTrue(result instanceof CommercialPlan);
    }

    @Test
    public void testGetPlan_institutional_plan() {
        String planType = "INSTITUTIONAL_PLAN";
        Plan result = factory.getPlan(planType);
        assertTrue(result instanceof InstitutionalPlan);
    }

}
