package menu.entity;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int id;
    private int pax;
    private Table table;
    private LocalDateTime time;

    List<Pizza> pizzas;
    List<Topping> Toppings;
    List<Beverage> beverages;

}
