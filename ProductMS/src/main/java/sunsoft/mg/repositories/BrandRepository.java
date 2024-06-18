package sunsoft.mg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.models.Brand;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
    public List<Brand> findByNameContaining(String name);
}
