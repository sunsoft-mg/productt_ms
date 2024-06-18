package sunsoft.mg.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sunsoft.mg.common.exception.DataNotFound;
import sunsoft.mg.common.exception.DataNotSuitable;

public class CommonController<T,R extends JpaRepository<T,Integer>,S extends CommonService<T,R>> {
    
    protected S service;
    public CommonController(S service){
        this.service = service;
    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody T model) throws DataNotSuitable {
        return this.response(this.service.create(model), 201);
    }

    @GetMapping("")
    public ResponseEntity<?> get(@RequestParam(required = false) Integer page,@RequestParam(required = false) Integer numberOfElement,@RequestParam(required = false) String filter){
        if(filter != null){
            return this.response(this.service.findByFilter(filter),200);
        }
        if(page == null){
            return this.response(this.service.findAll(), 200);
        }else{
            if(numberOfElement == null){
                numberOfElement = 100;
            }
            return this.response(this.service.getByPage(page, numberOfElement), 200);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUnique(@PathVariable(required = false) Integer id) throws DataNotFound {
        return this.response(this.service.getById(id),200);
    }

    @PutMapping("")
    public ResponseEntity<?> update(@RequestBody T model) throws DataNotSuitable{
        return this.response(this.service.update(model), 200);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        this.service.delete(id);
        return this.statusCode(200);
    }


    protected ResponseEntity<?> response(Object response,int status){
        return new ResponseEntity<>(response,HttpStatus.valueOf(status));
    }
    protected ResponseEntity<?> statusCode(int status){
        return new ResponseEntity<>(HttpStatus.valueOf(status));
    }
}
