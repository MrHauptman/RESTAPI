package com.practise.rest.controllers;
import com.practise.rest.ProductRepo.ProductRepos;
import com.practise.rest.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class productController {
    @Autowired
    private ProductRepos productRepos;

    @GetMapping(value = "/")
        public String getPage() {
            return "Hello world!";
        }
    @GetMapping(value = "/products")
    public List<Product> getProduct()
    {
        return productRepos.findAll();
    }
    @PostMapping(value = "/save")
    public String saveProduct(@RequestBody Product product){
      productRepos.save(product);
      return "Saved...";
    };
    }

