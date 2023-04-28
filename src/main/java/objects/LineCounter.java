package objects;

import lombok.Getter;

public class LineCounter {

    @Getter
    private final String line;

    public LineCounter(String line) {
        this.line = line;
    }

    public int countValues() {
        char[] chars = line.toCharArray();
        boolean isDigitFound = false;
        StringBuilder helper = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--){
            if (Character.isDigit(chars[i])){
                helper.append(chars[i]);
                isDigitFound = true;
            }
            else if (isDigitFound){
                break;
            }
        }

        try {
            return Integer.parseInt(helper.reverse().toString());
        }
        catch (IllegalArgumentException e){
            return 0;
        }
    }
}
