package sunsoft.mg.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sunsoft.mg.common.exception.DataNotSuitable;
import sunsoft.mg.common.interfaces.HasId;

public class CommonLiteController<T extends HasId,L,TR extends JpaRepository<T,String>,LR extends JpaRepository<L,String>,S extends CommonLiteService<T,L,TR,LR>> extends CommonController<T,TR,S> {

    public CommonLiteController(S service) {
        super(service);
    }

    @Override
    @PostMapping("")
    public ResponseEntity<?> create(T model) throws DataNotSuitable {
        return this.response(service.createWithLiteReturning(model), 200);
    }

    @Override
    @PutMapping("")
    public ResponseEntity<?> update(T model) throws DataNotSuitable {
        return this.response(service.updateWithLiteReturning(model),200);
    }
    
    @GetMapping("")
    @Override
    public ResponseEntity<?> get(@RequestParam(required = false)Integer page,@RequestParam(required = false) Integer numberOfElement,@RequestParam(required = false) String filter){
        if(filter != null){
            return this.response(this.service.findByFilterLite(filter),200);
        }
        
        if(page == null){
            return this.response(this.service.findAllLite(), 200);
        }else{
            if(numberOfElement == null){
                numberOfElement = 100;
            }
            return this.response(this.service.findAllLiteByPage(page, numberOfElement), 200);
        }
    }
}
