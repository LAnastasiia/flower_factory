package flower_factory.specs;

import lombok.Getter;
import lombok.ToString;


@ToString
public enum Smell {

    NICE("tender", 3), BRIGHT("vivid", 7), EXTRA("frantic", 10);
    @Getter
    private final String smell_name;
    private final int smell_intensity;

    Smell(String name, int intensity){
        this.smell_name = name;
        this.smell_intensity = intensity;
    }
}
