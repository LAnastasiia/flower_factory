package flower_factory.flowers;

import flower_factory.specs.Color;
import flower_factory.specs.Country;
import flower_factory.specs.Length;
import flower_factory.specs.Smell;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;


@Getter
@Setter
public class Flower {
    private Smell smell;
    private Country country_of_origin;
    private Color color;
    private double length_of_stem;
    private double price;


    public Flower(Color color, Smell smell, Country country, double length, double price) {
        this.color = color;
        this.smell = smell;
        this.country_of_origin = country;
        this.price = price;
        this.length_of_stem = length;
    }
}