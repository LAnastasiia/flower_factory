package flower_factory.specs;

public enum FlowerType {
    CHAMILE("Number of petals"), ROSIE("Spikes"), TULIP("Openness");

    private String specifications;
    FlowerType(String in_specs){
        this.specifications = in_specs;
    }
}
