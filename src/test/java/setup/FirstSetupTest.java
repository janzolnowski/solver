package setup;

import input.InputGetter;
import objects.Condition;
import objects.Goal;
import objects.Line;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FirstSetupTest {

    InputGetter inputGetter = new InputGetter("/home/janzolnowski/IdeaProjects/solver/src/main/resources/example");
    FirstSetup firstSetup = new FirstSetup(inputGetter);
    Goal goal = new Goal("3x1+6x2-x3->max");
    Condition exampleCondition = new Condition("x1+5x3>7");

    FirstSetupTest() throws IOException {
    }

    @Test
    void inputShouldBeProperlyRead() {
        List<String> forTest = firstSetup.getConditionLines();
        assertThat(forTest.size()).isEqualTo(4);
        assertThat(forTest.get(2)).isEqualTo(exampleCondition.getStringLine());
    }

    @Test
    void setupShouldProperlyReadInput(){
        assertTrue(firstSetup.getGoal().equals(goal));
        assertTrue(firstSetup.getConditions().get(1).equals(exampleCondition));
    }
}