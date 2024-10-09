package ie.atu.week2.week2_refresh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Positive;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Product {
    private Long id;

    @NotNull(message = "Product name cannot be null")
    @Size(min = 2, message = "Product name must be at least 2 characters")
    private String name;

    @Positive(message = "Price must be a positive number")
    private double price;

    // Constructor
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Default constructor
    public Product() {
    }

    // Getter for 'id'
    public Long getId() {
        return id;
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Getter for 'price'
    public double getPrice() {
        return price;
    }

    // Setter for 'id'
    public void setId(Long id) {
        this.id = id;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Setter for 'price'
    public void setPrice(double price) {
        this.price = price;
    }
}



















