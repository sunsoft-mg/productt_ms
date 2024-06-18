package sunsoft.mg.services;

import org.springframework.stereotype.Service;
import sunsoft.mg.common.CommonService;
import sunsoft.mg.models.CodeProduct;
import sunsoft.mg.repositories.CodeProductRepo;

import java.util.List;

@Service
public class CodeProductService extends CommonService<CodeProduct, CodeProductRepo> {
    protected CodeProductService(CodeProductRepo repository) {
        super(repository);
    }

    @Override
    public List<CodeProduct> findByFilter(String filter) {
        return repository.findByValueContaining(filter);
    }
}
