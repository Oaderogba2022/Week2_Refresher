package ie.atu.week2.week2_refresh;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class productService {

    private final List<Product> productList = new ArrayList<>();

    public List<Product> getAllProducts() {
        return productList;
    }

    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                return product;
            }
        }
        return null; // Return null if the product with the given id is not found
    }

    public void deleteProduct(Long id) {
        productList.removeIf(product -> product.getId().equals(id)); // More descriptive name
    }
}


