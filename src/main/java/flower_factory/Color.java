package flower_factory;

import lombok.ToString;


@ToString
public enum Color {

    RED("Red", "1FF"), GREEN("Green", "2FF"), BLUE("Blue", "0FF");

    private final String color_name;
    private final String rgb_code;

    Color(String name, String rgb_code){
        this.color_name = name;
        this.rgb_code = rgb_code;
    }
}


