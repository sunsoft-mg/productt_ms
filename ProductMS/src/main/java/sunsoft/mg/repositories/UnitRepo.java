package sunsoft.mg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.models.Unit;

import java.util.List;

public interface UnitRepo extends JpaRepository<Unit,String> {
    List<Unit> findByUnitContaining(String unit);
}