package sunsoft.mg.services;


import org.springframework.stereotype.Service;
import sunsoft.mg.common.CommonService;
import sunsoft.mg.models.Category;
import sunsoft.mg.repositories.CategoryRepository;

import java.util.List;

@Service
public class CategoryService extends CommonService<Category, CategoryRepository> {

    protected CategoryService(CategoryRepository repository) {
        super(repository);
    }

    @Override
    public List<Category> findByFilter(String filter) {
        return this.repository.findByNameContainingOrCodeContaining(filter,filter);
    }
    
}
