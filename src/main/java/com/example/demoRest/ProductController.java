package com.example.demoRest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController
{
    @Autowired
    private IProductService productService;

    @GetMapping(value = "/products")
    public ResponseEntity<List<Product>> getProduct()
    {
        List<Product> products = productService.findAll();
        return ResponseEntity.ok().body(products);
    }

    @PostMapping("/products")
    public ResponseEntity<String > addProduct(@RequestBody Product p) {
        boolean added = productService.addProduct(p);
        if(added)
            return ResponseEntity.ok().body("added");
        else
            return ResponseEntity.internalServerError().body("not added");

    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product p = productService.getProductById(id);
        return ResponseEntity.ok().body(p);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestBody Product p) {
        boolean added = productService.updateProduct(id, p);
        return ResponseEntity.ok().body("updated");
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        boolean deleted = productService.deleteProductById(id);
        return ResponseEntity.ok().body("deleted");
    }

}