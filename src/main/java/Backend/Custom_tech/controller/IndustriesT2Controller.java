package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.IndustriesT2;
import Backend.Custom_tech.service.IndustriesT2Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/IndustriesT2")
public class IndustriesT2Controller {
    
    private final IndustriesT2Service industriesT2Service;
    
    public IndustriesT2Controller(IndustriesT2Service industriesT2Service) {
        this.industriesT2Service = industriesT2Service;
    }

    @PostMapping
    public IndustriesT2 create(@RequestBody IndustriesT2 industriesT2) {
        return industriesT2Service.save(industriesT2);
    }

    @GetMapping
    public List<IndustriesT2> getAll() {
        return industriesT2Service.getAll();

    }

    @PutMapping("/{id}")
    public IndustriesT2 update(@RequestBody IndustriesT2 industriesT2, @PathVariable Long id) {
        return industriesT2Service.update(id ,industriesT2);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        industriesT2Service.delete(id);
        return "Deleted Successfully";
    }
}
