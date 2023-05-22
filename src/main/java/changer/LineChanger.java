package changer;

import lombok.Getter;
import objects.Line;

public class LineChanger{
    @Getter
    private final Line line;
    private final ILineChanger changer;

    public LineChanger(Line line, ILineChanger changer) {
        this.line = line;
        this.changer = changer;
    }

    public Line processChange(){
        return changer.change();
    }
}
