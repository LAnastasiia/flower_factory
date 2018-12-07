package flower_factory;

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

    public float getPrice(){
        float bouquet_price = 0;
        for(FlowerSet fg: flowersets){
            bouquet_price += fg.getPrice();
        }
        return bouquet_price;
    }
}
