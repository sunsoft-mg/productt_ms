package sunsoft.mg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.models.Tva;

import java.util.List;

public interface TvaRepo extends JpaRepository<Tva,String> {
    List<Tva> findByDescriptionContaining(String description);
}
