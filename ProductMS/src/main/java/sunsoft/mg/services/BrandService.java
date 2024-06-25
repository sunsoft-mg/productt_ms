package sunsoft.mg.services;

import org.springframework.stereotype.Service;
import sunsoft.mg.common.CommonService;
import sunsoft.mg.models.Brand;
import sunsoft.mg.repositories.BrandRepository;

import java.util.List;

@Service
public class BrandService extends CommonService<Brand, BrandRepository> {

    protected BrandService(BrandRepository repository) {
        super(repository);
    }

    @Override
    public List<Brand> findByFilter(String filter) {
        return this.repository.findByNameContaining(filter);
    }

    @Override
    public Brand findByCodeUUID(String uuid) {
        return repository.findTopByUuid(uuid);
    }

}
