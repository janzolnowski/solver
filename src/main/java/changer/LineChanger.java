package changer;

import lombok.Getter;
import objects.Line;

public class LineChanger implements ILineChanger{
    @Getter
    private final Line line;
    private final ILineChanger changer;

    public LineChanger(Line line, ILineChanger changer) {
        this.line = line;
        this.changer = changer;
    }

    @Override
    public Line change() {
        return changer.change();
    }
}
