package sunsoft.mg.services;


import org.springframework.stereotype.Service;
import sunsoft.mg.common.CommonLiteService;
import sunsoft.mg.models.Color;
import sunsoft.mg.models.subCategory.SubCategory;
import sunsoft.mg.models.subCategory.SubCategoryLite;
import sunsoft.mg.repositories.subCategory.SubCategoryLiteRepository;
import sunsoft.mg.repositories.subCategory.SubCategoryRepository;

import java.util.List;

@Service
public class SubCategoryService extends CommonLiteService<SubCategory, SubCategoryLite, SubCategoryRepository, SubCategoryLiteRepository> {


    protected SubCategoryService(SubCategoryRepository repository, SubCategoryLiteRepository liteRepository) {
        super(repository, liteRepository);
    }

    @Override
    public List<SubCategoryLite> findByFilterLite(String filter) {
        return this.liteRepository.findByCodeContainingOrNameContaining(filter, filter);
    }

    @Override
    public SubCategory findByCodeUUID(String uuid) {
        return repository.findTopByUuid(uuid);
    }
}
