package objects;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GoalTest {

    String exampleLine = "x1+7x2-x3+4x5-x17->min";
    Goal goal = new Goal(exampleLine);

    @Test
    void goalValueListShouldHaveValues(){
        assertThat(goal.getLineValues().size()).isEqualTo(17);
        assertThat(goal.getLineValues().get(16)).isEqualTo(-1);
    }

    @Test
    void goalShouldHaveDestination(){
        assertThat(goal.getDestination()).isEqualTo("min");
    }

}