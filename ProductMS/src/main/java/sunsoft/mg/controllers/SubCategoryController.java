package sunsoft.mg.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunsoft.mg.common.CommonLiteController;
import sunsoft.mg.models.subCategory.SubCategory;
import sunsoft.mg.models.subCategory.SubCategoryLite;
import sunsoft.mg.repositories.subCategory.SubCategoryLiteRepository;
import sunsoft.mg.repositories.subCategory.SubCategoryRepository;
import sunsoft.mg.services.SubCategoryService;

@RestController
@RequestMapping("subcategory")
@CrossOrigin
public class SubCategoryController extends CommonLiteController<SubCategory, SubCategoryLite, SubCategoryRepository, SubCategoryLiteRepository, SubCategoryService> {

    public SubCategoryController(SubCategoryService service) {
        super(service);
    }
}
