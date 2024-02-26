package ma.site.dentiste.controller;

import ma.site.dentiste.entity.Dentiste;
import ma.site.dentiste.service.BaseService;
import ma.site.dentiste.service.DentisteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dentistes")
public class DentisteController extends BaseController<Dentiste> {

    private final DentisteService dentisteService;

    public DentisteController( DentisteService dentisteService) {
        super(dentisteService);
        this.dentisteService = dentisteService;
    }

}
