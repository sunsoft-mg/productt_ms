package sunsoft.mg.services;


import org.springframework.stereotype.Service;
import sunsoft.mg.common.CommonService;
import sunsoft.mg.models.Color;
import sunsoft.mg.models.PrizeSystem;
import sunsoft.mg.repositories.PrizeSystemRepository;

import java.util.List;

@Service
public class PrizeSystemService extends CommonService<PrizeSystem, PrizeSystemRepository> {

    protected PrizeSystemService(PrizeSystemRepository repository) {
        super(repository);
    }

    @Override
    public List<PrizeSystem> findByFilter(String filter) {
        return List.of();
    }
    @Override
    public PrizeSystem findByCodeUUID(String uuid) {
        return repository.findTopByUuid(uuid);
    }
    public List<PrizeSystem> getAll(){
        return this.repository.findAll();
    }
}
