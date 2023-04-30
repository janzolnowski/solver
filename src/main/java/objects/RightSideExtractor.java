package objects;

import lombok.Getter;

public class RightSideExtractor {
    private final Line line;
    char[] chars;
    @Getter
    private String sign;
    @Getter
    private double rightValue;
    @Getter
    private String destination;

    public RightSideExtractor(Line line) {
        this.line = line;
        chars = line.getStringLine().toCharArray();
        extract();
    }


    private void extract() {
        if (line instanceof Goal) {
            destination = setDestination();
        }
        else if (line instanceof Condition) {
            sign = setSign();
            rightValue = setRightValue();
        }
    }

    private String setSign() {
        StringBuilder signBuilder = new StringBuilder();

        for (char aChar : chars) {
            if (aChar == '<' || aChar == '>' || aChar == '=') {
                signBuilder.append(aChar);
            }
        }
        return signBuilder.toString();
    }

    private double setRightValue() {
        StringBuilder rightValueBuilder = new StringBuilder();
        boolean isSignFound = false;

        for (char aChar : chars) {
            if (aChar == '<' || aChar == '>' || aChar == '=') {
                isSignFound = true;
            }
            if (isSignFound && Character.isDigit(aChar)) {
                rightValueBuilder.append(aChar);
            }
        }

        try {
            return Double.parseDouble(rightValueBuilder.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private String setDestination() {
        StringBuilder destinationBuilder = new StringBuilder();
        boolean isItTime = false;

        for (char aChar : chars) {
            if (isItTime) {
                destinationBuilder.append(aChar);
            }
            if (aChar == '>') {
                isItTime = true;
            }
        }

        return destinationBuilder.toString();
    }
}
