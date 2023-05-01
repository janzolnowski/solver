import input.InputGetter;
import objects.Condition;
import objects.DoubleParser;
import objects.LineCounter;
import objects.LineCutter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InputGetter input = new InputGetter("/home/janzolnowski/IdeaProjects/solver/src/main/resources/example");
        System.out.println(input.getFileLines());

    }
}
