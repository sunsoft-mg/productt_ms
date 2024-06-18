package sunsoft.mg.common;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.common.exception.DataNotSuitable;
import sunsoft.mg.common.interfaces.HasId;

import java.util.List;
import java.util.Optional;

public abstract class CommonLiteService<T extends HasId,L,R extends JpaRepository<T,Integer>,LR extends JpaRepository<L,Integer>> extends CommonService<T,R> {

    protected final LR liteRepository;

    protected CommonLiteService(R repository,LR liteRepository) {
        super(repository);
        this.liteRepository = liteRepository;
    }

    public List<L> findAllLite(){
        return this.liteRepository.findAll();
    }
    private L findById(Integer id) throws DataNotSuitable {
        Optional<L> optional = this.liteRepository.findById(id);
        if(optional.isEmpty()){
            throw new DataNotSuitable("Aucune donnée trouvée");
        }
        return optional.get();
    }

    public L createWithLiteReturning(T model) throws DataNotSuitable{
        T created = this.create(model);
        return this.findById(created.getId());
    }
    public L updateWithLiteReturning(T model) throws DataNotSuitable{
        T updated = this.update(model);
        return this.findById(updated.getId());
    }
    public Page<L> findAllLiteByPage(int page,int numberOfElement){
        return this.liteRepository.findAll(PageRequest.of(page,numberOfElement));
    }

    @Override
    public List<T> findByFilter(String filter) {
        return null;
    }

    public abstract List<L> findByFilterLite(String filter);
}
