package menu.config;

import menu.entity.Pizza;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class PizzaConfig {

    private final ToppingConfig toppings;

    @Bean
    public Pizza pizzaMargherita() {
        return new Pizza(
                "Margherita",
                Arrays.asList(toppings.tomato(), toppings.mozzarella(), toppings.basil()));
    }

    public Pizza pizzaPepperoni() {
        return new Pizza(
                "Pepperoni",
                Arrays.asList(toppings.tomato(), toppings.mozzarella(), toppings.pepperoni()));
    }

    @Bean
    public Pizza pizzaVegetarian() {
        return new Pizza(
                "Vegetarian",
                Arrays.asList(toppings.tomato(), toppings.mozzarella(), toppings.mushrooms(), toppings.basil()));
    }

    @Bean
    public Pizza pizzaMargheritaXL() {
        return new Pizza(
                "Margherita XL",
                Arrays.asList(toppings.tomato(), toppings.mozzarella(), toppings.basil()),
                true);
    }

    @Bean
    public Pizza pizzaPepperoniXL() {
        return new Pizza(
                "Pepperoni XL",
                Arrays.asList(toppings.tomato(), toppings.mozzarella(), toppings.pepperoni()),
                true);
    }

    @Bean
    public Pizza pizzaVegetarianXL() {
        return new Pizza(
                "Vegetarian XL",
                Arrays.asList(toppings.tomato(), toppings.mozzarella(), toppings.mushrooms(), toppings.basil()),
                true);
    }

    @Bean
    public List<Pizza> getAllPizzas() {
        return Arrays.asList(pizzaMargherita(), pizzaPepperoni(), pizzaVegetarian());
    }

    @Bean
    public List<Pizza> getAllXLPizzas() {
        return Arrays.asList(this.pizzaMargheritaXL(), this.pizzaPepperoniXL(), this.pizzaVegetarianXL());
    }
}
