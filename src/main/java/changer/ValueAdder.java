package changer;

import objects.Condition;
import objects.Line;

public class ValueAdder implements ILineChanger {

    private final Condition condition;

    public ValueAdder(Condition condition) {
        this.condition = condition;
    }

    @Override
    public Line change() {
        if (condition.getSign().startsWith("<")) {
            try {
                condition.addValue(1D);
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        } else if (condition.getSign().startsWith(">")) {
            try {
                condition.addValue(-1D);
                condition.addValue()
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        }
    }
}
