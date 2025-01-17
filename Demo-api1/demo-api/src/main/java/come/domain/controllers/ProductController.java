package come.domain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import come.domain.models.entities.Product;
import come.domain.services.ProductSeervice;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private ProductSeervice ProductSeervice;

    @PostMapping
    public Product create(@RequestBody Product product){
        return ProductSeervice.save(product);

    }
    @GetMapping
    public Iterable<Product> findAll(){
        return ProductSeervice.findAll();
    }

    @GetMapping("/{id}")
    public Product findOne(@PathVariable("id")Long id){
        return ProductSeervice.findOne(id);
    }

    @PutMapping
    public Product update(@RequestBody Product product){
        return ProductSeervice.save(product);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id")Long id){
        ProductSeervice.findOne(id);
    }
}
