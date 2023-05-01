package objects;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class LineCutter {
    private final String line;
    private List<Integer> values;

    public LineCutter(String line, int count) {
        this.line = line;
        values = fill(count);
    }

    //too long and too complicated method but working properly :)
    public List<Integer> cut() {
        StringBuilder value = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char x = line.charAt(i);
            char y = line.charAt(i + 1);
            char z;
            try {
                z = line.charAt(i + 2);
            } catch (IndexOutOfBoundsException e){
                z = '!';
            }

            if (x == '<' || x == '>' || x == '=' || (x == '-' && y == '>')) {
                break;
            } else if (Character.isDigit(x) || x == '-') {
                value.append(x);
            } else if (x == 'x') {
                try {
                    StringBuilder helper = new StringBuilder();
                    helper.append(y);
                    i++;
                    if (Character.isDigit(z)) {
                        helper.append(z);
                        i++;
                    }
                    if (value.isEmpty() || value.toString().equals("-")){
                        value.append("1");
                    }

                    values.set(Integer.parseInt(helper.toString()) - 1,
                            Integer.parseInt(value.toString()));
                }
                catch (IllegalArgumentException | IndexOutOfBoundsException e){
                    return null;
                }
                value = new StringBuilder();
            }
        }
        return values;
    }

    private List<Integer> fill(int count){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        return list;
    }


}
