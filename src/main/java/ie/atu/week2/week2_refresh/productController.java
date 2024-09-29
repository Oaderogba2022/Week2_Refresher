package ie.atu.week2.week2_refresh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/products")
public class productController {
   @Autowired
   private productService productService;

   @GetMapping
   public List<Product> getProductList() {
      return productService.getAllProducts();
   }

   @PostMapping
   public Product addProduct(@Valid @RequestBody Product product) {
      return productService.addProduct(product);
   }

   @PutMapping("/{id}")
   public Product updateProduct(@PathVariable Long id, @Valid @RequestBody Product updatedProduct) {
      return productService.updateProduct(id, updatedProduct);
   }

   @DeleteMapping("/{id}")
   public void deleteProduct(@PathVariable Long id) {
      productService.deleteProduct(id); // No message printed
   }
}
