package flower_factory;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class FlowerSpecs {
    private Color color;
    private double price;
    private Smell smell;
    private Country country;
}