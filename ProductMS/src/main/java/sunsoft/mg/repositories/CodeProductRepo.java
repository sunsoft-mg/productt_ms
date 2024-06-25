package sunsoft.mg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.models.CodeProduct;

import java.util.List;

public interface CodeProductRepo extends JpaRepository<CodeProduct, Integer> {
    CodeProduct findTopByUuid(String uuid);
    List<CodeProduct> findByValueContaining(String code);
}
