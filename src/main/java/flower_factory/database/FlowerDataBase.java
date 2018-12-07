package flower_factory.database;

import flower_factory.Bouquet;
import flower_factory.FlowerSet;
import flower_factory.flowers.Chamomile;
import flower_factory.flowers.Rosie;
import flower_factory.flowers.Tulip;
import flower_factory.specs.Color;
import flower_factory.specs.Country;
import flower_factory.specs.Smell;


public class FlowerDataBase {
    public Bouquet makeDesignedBouquet(){
        Chamomile flower_1 = new Chamomile(Color.BLUE, Smell.NICE, Country.NE, 12.5, 45.5);
        FlowerSet fs_chamomiles = new FlowerSet(flower_1, 7);

        Rosie flower_2 = new Rosie(Color.RED, Smell.BRIGHT, Country.UA, 34.0, 85.5);
        FlowerSet fs_rosies = new FlowerSet(flower_2, 5);

        Tulip flower_3 = new Tulip(Color.GREEN, Smell.NICE, Country.PL, 22.7, 23.5);
        FlowerSet fs_tulips = new FlowerSet(flower_3, 3);

        Bouquet b1 = new Bouquet();
        b1.addFlowerSet(fs_chamomiles);
        b1.addFlowerSet(fs_rosies);
        b1.addFlowerSet(fs_tulips);
        return b1;
    }

}
