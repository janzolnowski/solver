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
        boolean isSignFound = false;
        boolean isDigitFound = false;
        StringBuilder helper = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--){
            if (chars[i] == '<' || chars[i] == '>' || chars[i] == '='){
                isSignFound = true;
            }
            else if (Character.isDigit(chars[i]) && isSignFound){
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
