package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.IndustriesT1;
import Backend.Custom_tech.service.IndustriesT1Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/IndustriesT1")
public class IndustriesT1Controller {

    private final IndustriesT1Service  industriesT1Service;

    public IndustriesT1Controller(IndustriesT1Service industriesT1Service) {
        this.industriesT1Service = industriesT1Service;
    }

    @PostMapping
    public IndustriesT1 create(@RequestBody IndustriesT1 industriesT1) {
        return industriesT1Service.save(industriesT1);
    }

    @GetMapping
    public List<IndustriesT1> getAll() {
        return industriesT1Service.getAll();

    }

    @PutMapping("/{id}")
    public IndustriesT1 update(@RequestBody IndustriesT1 industriesT1, @PathVariable Long id) {
        return industriesT1Service.update(id ,industriesT1);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        industriesT1Service.delete(id);
        return "Deleted Successfully";
    }
}
