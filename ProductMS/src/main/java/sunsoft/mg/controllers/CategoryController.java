package sunsoft.mg.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunsoft.mg.common.CommonController;
import sunsoft.mg.models.Category;
import sunsoft.mg.repositories.CategoryRepository;
import sunsoft.mg.services.CategoryService;

@RequestMapping("category")
@RestController
@CrossOrigin
public class CategoryController extends CommonController<Category, CategoryRepository, CategoryService> {

    public CategoryController(CategoryService service) {
        super(service);
    }
    
}
