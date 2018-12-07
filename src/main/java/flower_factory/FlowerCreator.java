package flower_factory;

import sun.security.util.Length;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class FlowerCreator {
    public FlowerCreator(){return;}

    public createFlower(Flower flower_instance){
        Random rnd = new Random();

        List<Color> all_colors = Arrays.asList(Color.values());
        List<Smell> all_smells = Arrays.asList(Smell.values());
        List<Country> all_countries = Arrays.asList(Country.values());
        List<Length> all_lengths = Arrays.asList(Length.values());

        Color color = all_colors.get(rnd.nextInt(all_colors.size()));
        Smell smell = all_smells.get(rnd.nextInt(all_smells.size()));
        Country country = all_countries.get(rnd.nextInt(all_countries.size()));
        Length length = all_smells.get(rnd.nextInt(all_smells.size()));

        return new Flower(color, smell, country, length, flower_instance.getPrice())
    }
}
