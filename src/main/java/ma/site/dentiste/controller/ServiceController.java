package ma.site.dentiste.controller;

import ma.site.dentiste.entity.Dentiste;
import ma.site.dentiste.entity.Service;
import ma.site.dentiste.service.BaseService;
import ma.site.dentiste.service.Services;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service")
    public class ServiceController extends BaseController<Service> {

        private final Services service;

        public ServiceController( Services service) {
            super(service);
            this.service = service;
        }
}
