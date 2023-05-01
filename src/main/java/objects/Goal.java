package objects;

import lombok.Getter;


public class Goal extends Line {
    @Getter
    private final String destination;
    private final RightSideExtractor rightSideExtractor;

    public Goal(String line) {
        super(line);
        rightSideExtractor = new RightSideExtractor(this);
        this.destination = rightSideExtractor.getDestination();
    }

    public boolean equals(Goal obj) {
        return this.getLineValues().equals(obj.getLineValues())
                && this.getDestination().equals(obj.getDestination());
    }

}
