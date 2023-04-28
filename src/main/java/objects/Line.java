package objects;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public abstract class Line {
    public static int countValues(String line) {
        int result = 0;
        for (char c : line.toCharArray()) {
            if (c == 'm') {
                break;
            }
            if (c == 'x') {
                result++;
            }
        }
        return result;
    }

}
