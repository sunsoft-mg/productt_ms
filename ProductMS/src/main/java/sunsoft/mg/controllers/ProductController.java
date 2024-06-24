package sunsoft.mg.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunsoft.mg.common.CommonController;
import sunsoft.mg.models.product.Product;
import sunsoft.mg.repositories.ProductRepository;
import sunsoft.mg.services.ProductService;

@RestController
@RequestMapping("product")
@CrossOrigin
public class ProductController extends CommonController<Product, ProductRepository, ProductService> {
    public ProductController(ProductService service) {
        super(service);
    }
}
