package com.example.security.control;

import com.example.security.model.ProductModel;
import com.example.security.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

        @Autowired
        private ProductRepository productRepository;

        @GetMapping("/list")
        public Iterable<ProductModel> list(){
            return productRepository.findAll();
        }

        @PostMapping("/register")
        public ProductModel register(@RequestBody ProductModel obj){
            return productRepository.save(obj);
        }
}
