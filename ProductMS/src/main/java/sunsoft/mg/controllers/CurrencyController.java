package sunsoft.mg.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunsoft.mg.common.CommonController;
import sunsoft.mg.models.Currency;
import sunsoft.mg.repositories.CurrencyRepo;
import sunsoft.mg.services.CurrencyService;

@RequestMapping("currency")
@RestController
@CrossOrigin
public class CurrencyController extends CommonController<Currency, CurrencyRepo, CurrencyService> {
    public CurrencyController(CurrencyService service) {
        super(service);
    }
}
