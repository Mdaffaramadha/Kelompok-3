package come.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import come.domain.models.entities.Product;
import come.domain.models.repos.ProductRepo;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductSeervice {

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product){
        return productRepo.save(product);

    }

    public Product findOne(Long id){
        Optional<Product> product = productRepo.findById(id);
        if(!product.isPresent()){
            return null;
        }
        return product.get();
    }

    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    public void removeOne(Long id){
        productRepo.deleteById(id);
    }
    
    public List<Product> finByname(String name){
        return productRepo.findByNameContains(name);
    }
}
