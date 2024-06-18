package sunsoft.mg.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunsoft.mg.common.CommonController;
import sunsoft.mg.models.CodeProduct;
import sunsoft.mg.repositories.CodeProductRepo;
import sunsoft.mg.services.CodeProductService;

@RestController
@RequestMapping("code_product")
@CrossOrigin
public class CodeProductController extends CommonController<CodeProduct, CodeProductRepo, CodeProductService> {
    public CodeProductController(CodeProductService service) {
        super(service);
    }
}
