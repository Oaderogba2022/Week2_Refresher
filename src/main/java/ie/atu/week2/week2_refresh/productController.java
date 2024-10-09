package ie.atu.week2.week2_refresh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/products")
public class productController {
   @Autowired
   private productService productService;

   private final InventoryClient inventoryClient;

   @Autowired
   public productController(InventoryClient inventoryClient) {
      this.inventoryClient = inventoryClient;
   }

   @PostMapping
   @ResponseStatus(HttpStatus.CREATED)
   public Product createProduct(@Valid @RequestBody Product product) {
      Inventory inventory = inventoryClient.getInventory(product.getId());
      // You can handle the inventory response here as needed
      return productService.addProduct(product);
   }
}
