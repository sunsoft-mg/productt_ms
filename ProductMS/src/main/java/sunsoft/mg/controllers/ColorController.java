package sunsoft.mg.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunsoft.mg.common.CommonController;
import sunsoft.mg.models.Color;
import sunsoft.mg.repositories.ColorRepo;
import sunsoft.mg.services.ColorService;

@RequestMapping("color")
@RestController
@CrossOrigin
public class ColorController extends CommonController<Color, ColorRepo, ColorService> {
    public ColorController(ColorService service) {
        super(service);
    }
}
