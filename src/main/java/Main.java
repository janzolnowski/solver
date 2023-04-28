import input.InputGetter;
import objects.LineCutter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineCutter line = new LineCutter("3x1+4x2-x7->min", 7);
        System.out.println(line.cut());
    }
}
