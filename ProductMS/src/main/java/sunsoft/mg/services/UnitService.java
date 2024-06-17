package sunsoft.mg.services;

import org.springframework.stereotype.Service;
import sunsoft.mg.common.CommonService;
import sunsoft.mg.models.Unit;
import sunsoft.mg.repositories.UnitRepo;

import java.util.List;

@Service
public class UnitService extends CommonService<Unit, UnitRepo> {
    protected UnitService(UnitRepo repository) {
        super(repository);
    }

    @Override
    public List<Unit> findByFilter(String filter) {
        return this.findByFilter(filter);
    }
}
