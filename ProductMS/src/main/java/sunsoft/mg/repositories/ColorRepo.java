package sunsoft.mg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.models.Color;

import java.util.List;

public interface ColorRepo extends JpaRepository<Color,Integer> {
    List<Color> findByDescriptionContainingOrReferenceContaining(String description,String reference);
}
