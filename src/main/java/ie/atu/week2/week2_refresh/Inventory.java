package ie.atu.week2.week2_refresh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Inventory {
    private Long productId;
    private int quantity;
}
