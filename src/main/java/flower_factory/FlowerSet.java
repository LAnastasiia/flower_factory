package flower_factory;

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
        this.flower = flower;
        this.quantity = quantity;
        this.flowers = new ArrayList<Flower>();

//        FlowerCreator g = new FlowerCreator();
//        for (int i = 0; i < quantity; i++) {
//            flowers.add(g.createFlower(flower));
//        }
        return;
    }

//    public void  addFlower(Flower new_flower){
//        if (new_flower.getClass() == flowertype){
//
//        }
//    }

    public float getPrice(){
        return flower.getPrice() * quantity;
    }
}
