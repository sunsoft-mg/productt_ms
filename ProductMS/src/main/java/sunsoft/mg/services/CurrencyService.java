package sunsoft.mg.services;

import org.springframework.stereotype.Service;
import sunsoft.mg.common.CommonService;
import sunsoft.mg.models.Color;
import sunsoft.mg.models.Currency;
import sunsoft.mg.repositories.CurrencyRepo;

import java.util.List;

@Service
public class CurrencyService extends CommonService<Currency, CurrencyRepo> {
    protected CurrencyService(CurrencyRepo repository) {
        super(repository);
    }

    @Override
    public List<Currency> findByFilter(String filter) {
        return this.repository.findByCurrencyContainingOrSigleContaining(filter,filter);
    }
    @Override
    public Currency findByCodeUUID(String uuid) {
        return repository.findTopByUuid(uuid);
    }
}
