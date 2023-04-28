import input.InputGetter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputGetter input = new InputGetter("src/main/resources/example");
        System.out.println(input.getFileLines());
    }
}
