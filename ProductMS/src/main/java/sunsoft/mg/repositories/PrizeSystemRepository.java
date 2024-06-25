package sunsoft.mg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.models.PrizeSystem;

public interface PrizeSystemRepository extends JpaRepository<PrizeSystem,Integer> {
    PrizeSystem findTopByUuid(String uuid);

}
