package ie.atu.week2.week2_refresh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;

    @NotNull
    @Size(min = 2)
    private String name;

    @Positive
    private double price;
}
