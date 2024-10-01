package ie.atu.week2.week2_refresh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Positive;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;

    @NotNull(message = "Product name cannot be null")
    @Size(min = 2, message = "Product name must be at least 2 characters")
    private String name;

    @Positive(message = "Price must be a positive number")
    private double price;
}
