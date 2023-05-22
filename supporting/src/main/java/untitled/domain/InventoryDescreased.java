package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class InventoryDescreased extends AbstractEvent {

    private Long id;

    public InventoryDescreased(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryDescreased() {
        super();
    }
}
