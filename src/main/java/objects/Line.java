package objects;

import lombok.Getter;

import java.util.List;

public abstract class Line {
    @Getter
    private final String stringLine;
    private final LineCounter lineCounter;
    private final LineCutter lineCutter;
    private final DoubleParser doubleParser;
    @Getter
    private List<Double> lineValues;

    public Line(String line) {
        this.stringLine = line;
        lineCounter = new LineCounter(line);
        lineCutter = new LineCutter(line,
                lineCounter.countValues());
        doubleParser = new DoubleParser(lineCutter.cut());
        lineValues = doubleParser.parse();
    }

}
