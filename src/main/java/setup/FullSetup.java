package setup;

import objects.Condition;
import objects.Goal;

import java.util.List;

public class FullSetup {
    private FirstSetup firstSetup;
    private Goal goal;
    private List<Condition> conditions;

    public FullSetup(FirstSetup firstSetup) {
        this.firstSetup = firstSetup;
        goal = firstSetup.getGoal();
        conditions = firstSetup.getConditions();
    }
}
