package input;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class InputTest {

    InputGetter input = new InputGetter("src/main/resources/example");

    InputTest() throws IOException {
    }

    @Test
    void inputBasedOnExampleFileShouldHaveThreeLines() throws IOException {
        assertThat(input.getFileLines().size()).isEqualTo(3);
    }
}