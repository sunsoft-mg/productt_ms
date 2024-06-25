package sunsoft.mg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sunsoft.mg.models.CodeProduct;
import sunsoft.mg.models.PrixProduct;

import java.util.List;

public interface PrixProduitRepo extends JpaRepository<PrixProduct, Integer> {
//    PrixProduct findTopByUuid(String uuid);

}
