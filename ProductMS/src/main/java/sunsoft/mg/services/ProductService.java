package sunsoft.mg.services;

import org.springframework.stereotype.Service;
import sunsoft.mg.common.CommonService;
import sunsoft.mg.models.Color;
import sunsoft.mg.models.product.Product;
import sunsoft.mg.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService extends CommonService<Product, ProductRepository> {
    protected ProductService(ProductRepository repository) {
        super(repository);
    }

    @Override
    public List<Product> findByFilter(String filter) {
        return this.repository.findProductByCodeContainingOrDesignationContaining(filter, filter);
    }
    @Override
    public Product findByCodeUUID(String uuid) {
        return repository.findTopByUuid(uuid);
    }
}
