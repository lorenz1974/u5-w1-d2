package menu.runners;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import menu.config.BeverageConfig;
import menu.config.PizzaConfig;
import menu.config.TableConfig;
import menu.config.ToppingConfig;
import menu.entity.Beverage;
import menu.entity.Order;
import menu.entity.Pizza;
import menu.entity.Table;
import menu.entity.TableState;

@Component
@RequiredArgsConstructor
@Slf4j
public class OrderRunner implements CommandLineRunner {

    private final Table table1;

    private final Pizza pizzaMargerita;
    private final Pizza pizzaPepperoniXL;

    private final Beverage water;
    private final Beverage soda;

    @Override
    public void run(String... args) throws Exception {

        log.info("OrderRunner started ...");
        log.debug("...with parameters: {}", (Object[]) args);

        Order orderTable1 = new Order();

        table1.setState(TableState.OCCUPIED);

        orderTable1.setTable(table1);

        orderTable1.setPax(table1.getPax() - 1);

        orderTable1.setTime(LocalDateTime.now());

        orderTable1.setPizzas(List.of(pizzaMargerita, pizzaMargerita,
                pizzaPepperoniXL));

        orderTable1.setToppings(List.of());

        orderTable1.setBeverages(List.of(water, soda, soda));

        log.info("Order for table 1: {}", orderTable1);
        log.info("OrderRunner finished.");

    }
}
