package objects;

import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Condition extends Line {

    @Getter
    private String sign;
    @Getter
    private double rightValue;
    private final RightSideExtractor rightSideExtractor;
    public Condition(String line) {
        super(line);
        rightSideExtractor = new RightSideExtractor(this);
        this.sign = rightSideExtractor.getSign();
        this.rightValue = rightSideExtractor.getRightValue();
    }

    public boolean equals(Condition obj) {
        return this.getLineValues().equals(obj.getLineValues())
                && this.getSign().equals(obj.getSign())
                && this.getRightValue() == obj.getRightValue();
    }
}
