package sunsoft.mg.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunsoft.mg.common.CommonController;
import sunsoft.mg.models.Tva;
import sunsoft.mg.repositories.TvaRepo;
import sunsoft.mg.services.TvaService;

@RequestMapping("tva")
@RestController
@CrossOrigin
public class TvaController  extends CommonController<Tva, TvaRepo, TvaService> {
    public TvaController(TvaService service) {
        super(service);
    }
}
