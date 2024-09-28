package ie.atu.week2.week2_refresh;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class productService {

    private List<Product> productList = new ArrayList<>();


    public List<Product> getAllProducts() {
        return productList;
    }

    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }



}
