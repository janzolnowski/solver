package objects;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

    String exampleLine = "x1+4x2-4x5+x7<=6";
    Condition condition = new Condition(exampleLine);

    @Test
    void conditionValuesAlsoShouldBeProperlyAssigned(){
        assertThat(condition.getLineValues().get(0)).isEqualTo(1);
        assertThat(condition.getLineValues().get(6)).isEqualTo(1);
        assertThat(condition.getLineValues().get(5)).isEqualTo(0);
    }

    @Test
    void conditionShouldHaveGoodSign(){
        assertThat(condition.getSign()).isEqualTo("<=");
    }

    @Test
    void alsoRightSideShouldBeNice(){
        assertThat(condition.getRightValue()).isEqualTo(6);
    }

}