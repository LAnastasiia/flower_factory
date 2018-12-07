package flower_factory.specs;

import lombok.ToString;


@ToString
public enum Country {

    NE("Nedetlands", 413), PL("Poland", 256), UA("Ukraine", 398);

    private final String full_name;
    private final int country_code;

    Country(String name, int code) {
        this.full_name = name;
        this.country_code = code;
    }
}