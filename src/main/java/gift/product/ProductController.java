package product;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {
    private final Map<Long, Product> products = new HashMap<>();

    @GetMapping("/products")
    public Collection<Product> getAllProducts(){
        System.out.println("getAll");
        return products.values();
    }
    @GetMapping("/product/get")
    public Product getProduct(@RequestParam("id") Long id){
        System.out.println("get");
        return products.get(id);
    }

    @PostMapping("/product/add")
    public Product addProduct(@RequestParam("id") Long id,
                              @RequestParam("name") String name,
                              @RequestParam("price") Long price,
                              @RequestParam("imageUrl") String imageUrl){
        System.out.println("add");
        return products.put(id, new Product(id, name, price, imageUrl));
    }

    @PostMapping("/product/update")
    public Product updateProduct(@RequestParam("id") Long id,
                                 @RequestParam("name") String name,
                                 @RequestParam("price") Long price,
                                 @RequestParam("imageUrl") String imageUrl){
        System.out.println("update");
        if(products.get(id) != null){
            return products.put(id, new Product(id, name, price, imageUrl));
        }
        else return null;
    }

    @DeleteMapping("/product/delete")
    public Product deleteProduct(@RequestParam("id") Long id){
        System.out.println("delete");
        if(products.get(id) != null){
            return products.remove(id);
        }
        return null;
    }
}
