package objects;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LineCounterTest {

    @Test
    void lineCounterShouldProperlyCountValues(){
        String exampleLine = "3x1+7x2-x3+4x5-x17->min";
        LineCounter lineCounter = new LineCounter(exampleLine);
        assertThat(lineCounter.countValues()).isEqualTo(17);
    }

}