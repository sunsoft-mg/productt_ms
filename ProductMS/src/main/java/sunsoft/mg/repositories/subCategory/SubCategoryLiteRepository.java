package sunsoft.mg.repositories.subCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.models.subCategory.SubCategoryLite;

import java.util.List;

public interface SubCategoryLiteRepository extends JpaRepository<SubCategoryLite,Integer> {
    List<SubCategoryLite> findByCodeContainingOrNameContaining(String code,String name);
}
