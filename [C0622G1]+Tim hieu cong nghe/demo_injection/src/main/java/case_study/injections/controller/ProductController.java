package case_study.injections.controller;

import case_study.injections.model.Product;
import case_study.injections.model.ProductDto1;
import case_study.injections.model.ProductDto2;
import case_study.injections.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("products")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping
    public String getAllProduct(Model model) {
        List<Product> products = productService.getAllProduct();
        model.addAttribute("products", products);
        return "products";
    }
}

