package sunsoft.mg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.models.Place;

import java.util.List;

public interface PlaceRepository extends JpaRepository<Place,Integer> {
    public List<Place> findByCodeContainingOrNameContaining(String code,String name);
}
