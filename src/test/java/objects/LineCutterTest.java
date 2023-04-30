package objects;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LineCutterTest {

    String exampleLine = "3x1+7x2-x4+4x5-x17->min";
    LineCounter lineCounter= new LineCounter(exampleLine);
    LineCutter lineCutter = new LineCutter(exampleLine, lineCounter.countValues());
    List<Integer> list = lineCutter.cut();

    @Test
    void listShouldHaveProperSize() {
        assertThat(list.size()).isEqualTo(17);
        assertThat(list.get(15)).isEqualTo(0);
    }

    @Test
    void listShouldAssignProperValues() {
        assertThat(list.get(0)).isEqualTo(3);
        assertThat(list.get(1)).isEqualTo(7);
        assertThat(list.get(2)).isEqualTo(0);
        assertThat(list.get(16)).isEqualTo(-1);
    }

}