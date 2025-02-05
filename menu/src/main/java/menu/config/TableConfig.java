package menu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import menu.entity.Table;
import menu.entity.TableState;

@Configuration
public class TableConfig {

    @Bean
    public Table table1() {
        return new Table(1, 4, TableState.FREE);
    }

    @Bean
    public Table table2() {
        return new Table(2, 2, TableState.FREE);
    }

    @Bean
    public Table table3() {
        return new Table(3, 10, TableState.FREE);
    }

}
