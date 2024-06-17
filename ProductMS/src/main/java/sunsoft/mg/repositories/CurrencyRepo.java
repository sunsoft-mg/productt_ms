package sunsoft.mg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sunsoft.mg.models.Currency;

import java.util.List;

public interface CurrencyRepo extends JpaRepository<Currency,String> {
    List<Currency> findByCurrencyContainingOrSigleContaining(String currency,String sigle);
}