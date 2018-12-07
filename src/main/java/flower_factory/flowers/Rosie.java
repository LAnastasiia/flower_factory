package flower_factory.flowers;

import flower_factory.specs.Color;
import flower_factory.specs.Country;
import flower_factory.specs.Smell;

public class Rosie extends Flower{
    public Rosie(Color color, Smell smell, Country country, double length, double price) {
        super(color, smell, country, length, price);
    }

    @Override
    public String toString() {
        return "Rosie     " + "~~ " + super.toString();
    }
}
