package sunsoft.mg.services;


import org.springframework.stereotype.Service;
import sunsoft.mg.models.PrizeSystem;
import sunsoft.mg.repositories.PrizeSystemRepository;

import java.util.List;

@Service
public class PrizeSystemService {
    final private PrizeSystemRepository repository;
    public PrizeSystemService(PrizeSystemRepository repository){
        this.repository = repository;
    }

    public List<PrizeSystem> getAll(){
        return this.repository.findAll();
    }
}
