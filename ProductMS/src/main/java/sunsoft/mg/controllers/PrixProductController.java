package sunsoft.mg.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunsoft.mg.common.CommonController;
import sunsoft.mg.models.PrixProduct;
import sunsoft.mg.repositories.PrixProduitRepo;
import sunsoft.mg.services.PrixProductService;

@RestController
@RequestMapping("prix_produit")
@CrossOrigin
public class PrixProductController extends CommonController<PrixProduct, PrixProduitRepo, PrixProductService> {
    public PrixProductController(PrixProductService service) {
        super(service);
    }
}
