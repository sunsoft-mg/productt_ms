package sunsoft.mg.services;

import org.springframework.stereotype.Service;
import sunsoft.mg.common.CommonService;
import sunsoft.mg.models.Place;
import sunsoft.mg.repositories.PlaceRepository;

import java.util.List;

@Service
public class PlaceService extends CommonService<Place, PlaceRepository> {

    protected PlaceService(PlaceRepository repository) {
        super(repository);
    }

    @Override
    public List<Place> findByFilter(String filter) {
        return this.repository.findByCodeContainingOrNameContaining(filter,filter);
    }
    
}
