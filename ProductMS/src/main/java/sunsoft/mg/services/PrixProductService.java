package sunsoft.mg.services;

import org.springframework.stereotype.Service;
import sunsoft.mg.common.CommonService;
import sunsoft.mg.models.PrixProduct;
import sunsoft.mg.repositories.PrixProduitRepo;

import java.util.List;

@Service
public class PrixProductService extends CommonService<PrixProduct, PrixProduitRepo> {
    protected PrixProductService(PrixProduitRepo repository) {
        super(repository);
    }

    @Override
    public List<PrixProduct> findByFilter(String filter) {
        return List.of();
    }
}
