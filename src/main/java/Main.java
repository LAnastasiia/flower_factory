import flower_factory.Bouquet;
import flower_factory.Creator;
import flower_factory.FlowerSet;
import flower_factory.database.FlowerDataBase;
import flower_factory.flowers.Chamomile;
import flower_factory.flowers.Rosie;
import flower_factory.flowers.Tulip;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        while(true){
            Scanner scanner = new Scanner( System.in );
            System.out.println("Hi dear customer. Welcome to the FlowerShop. \n" +
                    "Would you like to buy a designed bouquet of flowers or create a custom one? (1, 2)");
            String input_answer = scanner.nextLine();

            if (input_answer.equals("1")){
                FlowerDataBase db = new FlowerDataBase();
                Bouquet design_bouquet = db.makeDesignedBouquet();
                System.out.println("Wonderful. Here is your bouquet order: \n" + design_bouquet.toString());
            }

            else if (input_answer.equals("2")){
                System.out.println("Great. Let's create Your unique bouquet.\n"
                        + " **{Chamomile - Rosie - Tulip} available");

                Bouquet b = new Bouquet();
                Creator creator = new Creator();

                // Chamomiles
                System.out.println("How many Chamomiles do You want in it: ");
                int number_of_cham_flowers = scanner.nextInt();
                Chamomile cham_flower = (Chamomile) creator.createFlower();
                FlowerSet cham_set = creator.createFlowerSet(cham_flower, number_of_cham_flowers);
                b.addFlowerSet(cham_set);

                // Rosies
                System.out.println("How many Rosies do You want in it: ");
                int number_of_rosie_flowers = scanner.nextInt();
                Rosie rosie_flower = (Rosie) creator.createFlower();
                FlowerSet rosie_set  = creator.createFlowerSet(rosie_flower, number_of_rosie_flowers);
                b.addFlowerSet(rosie_set);

                // Tulips
                System.out.println("How many Rosies do You want in it: ");
                int number_of_tul_flowers = scanner.nextInt();
                Tulip tul_flower = (Tulip) creator.createFlower();
                FlowerSet tul_set  = creator.createFlowerSet(tul_flower, number_of_tul_flowers);
                b.addFlowerSet(tul_set);
            }
        }
    }

}
