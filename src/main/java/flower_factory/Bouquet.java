package flower_factory;

import flower_factory.flowers.Flower;
import java.util.ArrayList;


public class Bouquet {
    private ArrayList<FlowerSet> flowersets;

    public Bouquet(){
        this.flowersets = new ArrayList<FlowerSet>();
    }


    public void addFlower(Flower new_flower){
        for(FlowerSet fs: flowersets){
            if (fs.getFlower().getClass() == new_flower.getClass()){
                fs.setQuantity(fs.getQuantity() + 1);
            }
        }
    }

    public int addFlowerSet(FlowerSet new_set){
        for (FlowerSet fs: flowersets){
            if (fs.getFlower().getClass() == new_set.getFlower().getClass()){
                fs.setQuantity(fs.getQuantity() + new_set.getQuantity());
                return 1;
            }
        }
        flowersets.add(new_set);
        return 0;
    }

    public float getPrice(){
        float bouquet_price = 0;
        for(FlowerSet fg: flowersets){
            bouquet_price += fg.getPrice();
        }
        return bouquet_price;
    }

    @Override
    public String toString() {
        String res_string = new String();
        return super.toString();
    }
}
