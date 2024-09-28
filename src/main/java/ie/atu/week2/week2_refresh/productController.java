package ie.atu.week2.week2_refresh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class productController {
   private final productService productService;

   @Autowired
   public productController(productService productService) {
      this.productService = productService;
   }

   @PostMapping("/products")
   public Product addProduct(@RequestBody Product product) {
      return productService.addProduct(product);
   }

   @GetMapping("/products")
   public List<Product> getProductList() {
      return productService.getAllProducts();
   }
}
