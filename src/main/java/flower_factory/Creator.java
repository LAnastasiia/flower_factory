package flower_factory;

import flower_factory.flowers.Flower;
import flower_factory.specs.Color;
import flower_factory.specs.Country;
import flower_factory.specs.Smell;

import java.util.Random;


public class Creator {
    private Random rnd;

    public Creator(){
        this.rnd = new Random();
    }

    public FlowerSet createFlowerSet(Flower flower_instance, int amount){
        return new FlowerSet(flower_instance, amount);
    }


    public Flower createFlower(){
        Color flower_color = Color.BLUE;
        switch (rnd.nextInt(3)) {
            case 0: flower_color = Color.RED;
            case 1: flower_color = Color.GREEN;
            case 2: flower_color = Color.BLUE;
        }
        Smell flower_smell = Smell.BRIGHT;
        switch (rnd.nextInt(3)) {
            case 0: flower_smell = Smell.NICE;
            case 1: flower_smell = Smell.EXTRA;
            case 2: flower_smell = Smell.BRIGHT;
        }
        Country flower_origin = Country.PL;
        switch (rnd.nextInt(3)) {
            case 0: flower_origin = Country.NE;
            case 1: flower_origin = Country.UA;
            case 2: flower_origin = Country.PL;
        }
        double flower_length = 3 + rnd.nextDouble() * 5;
        double flower_price = 25 + rnd.nextInt() * 10;

        return new Flower(flower_color, flower_smell, flower_origin, flower_length, flower_price);
    }
}
