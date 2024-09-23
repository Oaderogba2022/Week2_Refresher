package ie.atu.week2.week2_refresh;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class productController {
   private List<Product> productlist = new ArrayList<Product>();

   @PostMapping("/products")
   public Product addProduct(@RequestBody Product product){

      productlist.add(product);
      return product;
   }
   @GetMapping("/products")
   public List<Product> getProductList(){
      return productlist;
   }

}
