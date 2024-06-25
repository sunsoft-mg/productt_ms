package sunsoft.mg.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.models.product.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer>{
    Product findTopByUuid(String uuid);

    List<Product> findProductByCodeContainingOrDesignationContaining(String code, String designation);
}
