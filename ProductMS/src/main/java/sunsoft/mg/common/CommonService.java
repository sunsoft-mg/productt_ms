package sunsoft.mg.common;


import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.common.exception.DataNotFound;
import sunsoft.mg.common.exception.DataNotSuitable;
import sunsoft.mg.common.interfaces.HasId;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public abstract class CommonService<T, R extends JpaRepository<T, Integer>> {
    protected final R repository;

    protected CommonService(R repository) {
        this.repository = repository;
    }

    @Transactional(rollbackOn = { Exception.class })
    public T create(T model) {
        return this.repository.save(model);
    }

    @Transactional(rollbackOn = { Exception.class })
    public T update(T model) throws DataNotSuitable {

        if (model instanceof HasId) {
            if (((HasId) model).getId() == null) {
                throw new DataNotSuitable("L'id du model est invalid");
            }
            return this.repository.save(model);
        }
        throw new DataNotSuitable("Le model " + model.getClass().getName() + " n'est pas modifiable");
    }

    @Transactional(rollbackOn = { Exception.class })
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }

    public List<T> findAll() {
        return this.repository.findAll();
    }

    public Page<T> getByPage(int page,int numberOfElement){
        return this.repository.findAll(PageRequest.of(page,numberOfElement));
    }

    public T getById(Integer id) throws DataNotFound {
        Optional<T> optional = this.repository.findById(id);
        if (optional.isEmpty()) {
            throw new DataNotFound("L'entité demandé est introuvable");
        }
        return optional.get();
    }
    public abstract List<T> findByFilter(String filter);
    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }
}
