package sunsoft.mg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.models.CodeProduct;
import sunsoft.mg.models.Place;

import java.util.List;

public interface PlaceRepository extends JpaRepository<Place,Integer> {
    Place findTopByUuid(String uuid);
    public List<Place> findByCodeContainingOrNameContaining(String code,String name);
}
