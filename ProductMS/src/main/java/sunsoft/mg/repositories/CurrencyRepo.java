package sunsoft.mg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.models.Currency;

import java.util.List;

public interface CurrencyRepo extends JpaRepository<Currency,Integer> {
    Currency findTopByUuid(String uuid);
    List<Currency> findByCurrencyContainingOrSigleContaining(String currency,String sigle);
}
