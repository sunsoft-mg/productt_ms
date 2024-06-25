package sunsoft.mg.services;

import org.springframework.stereotype.Service;
import sunsoft.mg.common.CommonService;
import sunsoft.mg.models.Color;
import sunsoft.mg.models.Tva;
import sunsoft.mg.repositories.TvaRepo;

import java.util.List;

@Service
public class TvaService extends CommonService<Tva, TvaRepo> {
    protected TvaService(TvaRepo repository) {
        super(repository);
    }

    @Override
    public List<Tva> findByFilter(String filter) {
        return this.repository.findByDescriptionContaining(filter);
    }
    @Override
    public Tva findByCodeUUID(String uuid) {
        return repository.findTopByUuid(uuid);
    }
}
