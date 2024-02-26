package ma.site.dentiste.controller;

import ma.site.dentiste.entity.RendezVous;
import ma.site.dentiste.repository.RendezVousRepository;
import ma.site.dentiste.service.BaseService;
import ma.site.dentiste.service.RendezVousService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rendezvous")
public class RendezVousController extends BaseController {

    private final RendezVousService rendezVousService;

    public RendezVousController(RendezVousService rendezVousService) {
        super(rendezVousService);
        this.rendezVousService = rendezVousService;
    }

}
