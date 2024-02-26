package ma.site.dentiste.controller;

import ma.site.dentiste.entity.Avis;
import ma.site.dentiste.service.AvisService;
import ma.site.dentiste.service.BaseService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avis")
public class AvisController extends BaseController<Avis> {

    private final AvisService avisService;

    public AvisController(AvisService avisService) {
        super(avisService);
        this.avisService = avisService;
    }

}
