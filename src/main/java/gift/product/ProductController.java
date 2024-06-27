package gift.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ProductController {
    private final Map<Long, Product> products = new HashMap<>();

    @GetMapping("/manager/product/{id}")
    public String getProduct(@PathVariable long id, Model model) {
        Product product = products.get(id);
        model.addAttribute("product", product);
        return "ProductInfo";
    }
}