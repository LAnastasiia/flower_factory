package flower_factory;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;


@Getter
@Setter
public class Flower {
    private Smell smell;
    private Country country_of_origin;
    private Color color;
    private float length_of_stem;
    private float price;


    // constructor
    public Flower(Color color, Smell smell, Country country, float length, float price){
        this.color = color;
        this.smell = smell;
        this.country_of_origin= country;
        this.price = price;
        this.length_of_stem = length;
    }
}







//    private FlowerSpecs flower_specs;    attribute


//    public Flower makeRandomFlower(Flower instance_flower){
//        return new Flower(flower.color.)
//    }