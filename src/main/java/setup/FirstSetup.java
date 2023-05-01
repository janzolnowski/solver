package setup;

import input.InputGetter;
import lombok.Getter;
import objects.Condition;
import objects.Goal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Getter
public class FirstSetup {
    private final InputGetter inputGetter;
    private final List<String> conditionLines;
    @Getter
    private Goal goal;
    @Getter
    private List<Condition> conditions;

    public FirstSetup(InputGetter inputGetter) throws IOException {
        this.inputGetter = inputGetter;
        conditionLines = inputGetter.getFileLines();
        conditions = setConditions(conditionLines);
        goal = setGoal(conditionLines);
    }

    private Goal setGoal(List<String> lines){
        return new Goal(lines.get(0));
    }

    private List<Condition> setConditions(List<String> lines){
        List<Condition> conditionz = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++){
            conditionz.add(new Condition(lines.get(i)));
        }
        return conditionz;
    }

}
