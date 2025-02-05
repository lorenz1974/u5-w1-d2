package menu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Topping implements PriceAndCalories {
    private String name;
    private double price;
    private double calories;

    private double XL_MULTIPLIER = 1.15;

    public Topping(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public Topping(String name, double price, int calories, boolean isXL) {
        this.name = name;
        this.price = price * XL_MULTIPLIER;
        this.calories = calories * XL_MULTIPLIER;
    }

}
