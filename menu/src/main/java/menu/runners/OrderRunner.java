package menu.runners;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import menu.entity.Beverage;
import menu.entity.Order;
import menu.entity.Pizza;
import menu.entity.Table;
import menu.entity.TableState;

@Component
@RequiredArgsConstructor
@Slf4j
public class OrderRunner implements CommandLineRunner {

    // Dependency injection of table and menu items
    private final Table table1;

    private final Pizza pizzaMargherita;
    private final Pizza pizzaPepperoniXL;

    private final Beverage water;
    private final Beverage soda;

    @Override
    public void run(String... args) throws Exception {

        // Clear the console
        System.out.println("\n".repeat(60));

        // Log the start of the runner
        log.info("OrderRunner started ...");
        log.debug("...with parameters: {}", (Object[]) args);

        // Create a new order for table 1
        Order orderTable1 = new Order();

        // Set the table state to occupied
        table1.setState(TableState.OCCUPIED);

        // Assign the table to the order
        orderTable1.setTable(table1);

        // Set the number of people at the table (pax) minus one
        orderTable1.setPax(table1.getPax() - 1);

        // Set the current time for the order
        orderTable1.setTime(LocalDateTime.now());

        // Add pizzas to the order
        orderTable1.setPizzas(List.of(pizzaMargherita, pizzaMargherita,
                pizzaPepperoniXL));

        // Add toppings to the order (empty list in this case)
        orderTable1.setToppings(List.of());

        // Add beverages to the order
        orderTable1.setBeverages(List.of(water, soda, soda));

        // Log the details of the order
        log.info("----------------------------------------");
        log.info("Order for table 1");
        log.info("----------------------------------------");
        log.info("" + orderTable1);
        log.info("OrderRunner finished.");

    }
}
