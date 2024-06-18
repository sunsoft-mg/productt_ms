package sunsoft.mg.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunsoft.mg.common.CommonController;
import sunsoft.mg.models.Brand;
import sunsoft.mg.repositories.BrandRepository;
import sunsoft.mg.services.BrandService;

@RestController
@RequestMapping("brand")
@CrossOrigin
public class BrandController extends CommonController<Brand, BrandRepository, BrandService> {

    public BrandController(BrandService service) {
        super(service);
    }
    
}
