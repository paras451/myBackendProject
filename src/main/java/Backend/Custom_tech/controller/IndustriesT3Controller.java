package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.IndustriesT3;
import Backend.Custom_tech.service.IndustriesT3Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/IndustriesT3")
public class IndustriesT3Controller {
    
    private final IndustriesT3Service industriesT3Service;
    
    public IndustriesT3Controller(IndustriesT3Service industriesT3Service) {
        this.industriesT3Service = industriesT3Service;
    }


    @PostMapping
    public IndustriesT3 create(@RequestBody IndustriesT3 industriesT3) {
        return industriesT3Service.save(industriesT3);
    }

    @GetMapping
    public List<IndustriesT3> getAll() {
        return industriesT3Service.getAll();

    }

    @PutMapping("/{id}")
    public IndustriesT3 update(@RequestBody IndustriesT3 industriesT3, @PathVariable Long id) {
        return industriesT3Service.update(id ,industriesT3);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        industriesT3Service.delete(id);
        return "Deleted Successfully";
    }
}
