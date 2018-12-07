import flower_factory.Bouquet;
import flower_factory.Creator;
import flower_factory.FlowerSet;
import flower_factory.database.FlowerDataBase;
import flower_factory.flowers.Chamomile;
import flower_factory.flowers.Flower;
import flower_factory.flowers.Rosie;
import flower_factory.flowers.Tulip;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        while(true){
            Scanner scanner = new Scanner( System.in );
            System.out.println("Hi dear customer. Welcome to the FlowerShop. \n" +
                    "Would you like to get a designed bouquet of flowers or create a custom one? (1 || 2)");
            String input_answer = scanner.nextLine();

            if (input_answer.equals("1")){
                FlowerDataBase db = new FlowerDataBase();
                Bouquet b = db.makeDesignedBouquet();
                System.out.println("Wonderful!");
                System.out.println("Here is Your designed bouquet: \n" + b.toString());

            }

            else if (input_answer.equals("2")){
                System.out.println("Great. Let's create Your unique bouquet.\n"
                        + " **{Chamomile - Rosie - Tulip} available\n");

                Bouquet b = new Bouquet();
                Creator creator = new Creator();

                // Chamomiles
                System.out.println("How many Chamomiles do You want in it: ");
                int number_of_cham_flowers = scanner.nextInt();
                Chamomile cham_flower = creator.createFlower(Chamomile.class);
                FlowerSet cham_set = creator.createFlowerSet(cham_flower, number_of_cham_flowers);
                b.addFlowerSet(cham_set);

                // Rosies
                System.out.println("How many Rosies do You want in it: ");
                int number_of_rosie_flowers = scanner.nextInt();
                Rosie rosie_flower = creator.createFlower(Rosie.class);
                System.out.println(rosie_flower.toString());
                FlowerSet rosie_set  = creator.createFlowerSet(rosie_flower, number_of_rosie_flowers);
                b.addFlowerSet(rosie_set);

                // Tulips
                System.out.println("How many Rosies do You want in it: ");
                int number_of_tul_flowers = scanner.nextInt();
                Tulip tul_flower = creator.createFlower(Tulip.class);
                FlowerSet tul_set  = creator.createFlowerSet(tul_flower, number_of_tul_flowers);
                b.addFlowerSet(tul_set);
                System.out.println("Here is Your custom bouquet: \n" + b.toString());
            }

            System.out.println("Would You like to order more? [Y/N]\n");
            String continue_answer = scanner.nextLine();
            if (continue_answer.equals("N") || continue_answer.equals("n"))
                { break; }
        }
    }

}
