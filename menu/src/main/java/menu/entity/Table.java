package menu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Table {
    private int id;
    private int pax;
    private TableState state;
}
