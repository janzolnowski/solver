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
        String line = "x1+4x2-4x5+x7<=6";
        LineCounter lineCounter = new LineCounter(line);
        LineCutter lineCutter = new LineCutter(line, lineCounter.countValues());
        System.out.println(lineCutter.cut());

    }
}
