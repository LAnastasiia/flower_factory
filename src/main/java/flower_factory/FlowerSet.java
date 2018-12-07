package flower_factory;

import flower_factory.flowers.Flower;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;


@Getter
@Setter
public class FlowerSet {
    private ArrayList<Flower> flowers;
    private Flower flower;
    private int quantity;

    public FlowerSet(Flower flower, int quantity){
        if (quantity > 0){
            this.flower = flower;
            this.quantity = quantity;
            this.flowers = new ArrayList<Flower>();
        }
    }

    public double getPrice(){
        return flower.getPrice() * quantity;
    }
}
