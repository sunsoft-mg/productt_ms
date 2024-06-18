package sunsoft.mg.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunsoft.mg.common.CommonController;
import sunsoft.mg.models.Place;
import sunsoft.mg.repositories.PlaceRepository;
import sunsoft.mg.services.PlaceService;

@RestController
@RequestMapping("place")
@CrossOrigin
public class PlaceController extends CommonController<Place, PlaceRepository, PlaceService> {

    public PlaceController(PlaceService service) {
        super(service);
    }
    
}
