package gift.product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {
    private final Map<Long, Product> products = new HashMap<>();

    @PostMapping("/product/add")
    public Product addProduct(@RequestParam("id") Long id,
                              @RequestParam("name") String name,
                              @RequestParam("price") Long price,
                              @RequestParam("imageUrl") String imageUrl){
        System.out.println("add");
        Product product = new Product(id, name, price, imageUrl);
        products.put(id, product);
        return product;
    }


}
