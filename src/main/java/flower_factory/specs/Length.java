package flower_factory.specs;

import lombok.ToString;


@ToString
public enum Length {
    LONG(22.7), MEDIUM(12.9), SHORT(7.7);
    private final double length;
    private final String length_description;

    Length(double len) {
        this.length = len;

        if (this.length < 10) {
            this.length_description = "short"; }
        else if (this.length < 15){
            this.length_description = "medium"; }
        else {
            this.length_description = "long"; }
    }
}


