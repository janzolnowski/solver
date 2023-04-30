package objects;

import java.util.ArrayList;
import java.util.List;

public class DoubleParser {
    private final List<Integer> list;
    public DoubleParser(List<Integer> list) {
        this.list = list;
    }

    public List<Double> parse(){
        List<Double> newList = fill(list.size());
        for (int i = 0; i < list.size(); i++) {
            newList.set(i, Double.valueOf(list.get(i)));
        }

        return newList;
    }

    private List<Double> fill(int count){
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add((double) 0);
        }
        return list;
    }
}
