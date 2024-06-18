package sunsoft.mg.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunsoft.mg.services.PrizeSystemService;

@RestController
@RequestMapping("prize_system")
@CrossOrigin
public class PrizeSystController {
    final private PrizeSystemService service;
    public PrizeSystController(PrizeSystemService service){
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(this.service.getAll(),HttpStatus.OK);
    }
}
