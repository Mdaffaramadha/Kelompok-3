package come.domain.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import come.domain.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long>{
    
    List<Product> findByNameContains(String name);

}
