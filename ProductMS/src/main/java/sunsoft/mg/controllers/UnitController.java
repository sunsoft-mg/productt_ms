package sunsoft.mg.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunsoft.mg.common.CommonController;
import sunsoft.mg.models.Unit;
import sunsoft.mg.repositories.UnitRepo;
import sunsoft.mg.services.UnitService;


@RequestMapping("unit")
@RestController
@CrossOrigin
public class UnitController extends CommonController<Unit, UnitRepo, UnitService> {
    public UnitController(UnitService service) {
        super(service);
    }
}
