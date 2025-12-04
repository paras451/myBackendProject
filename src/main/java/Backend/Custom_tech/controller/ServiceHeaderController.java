package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.ServiceHeader;
import Backend.Custom_tech.repository.ServiceHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service")
public class ServiceHeaderController {


    @Autowired
    private ServiceHeaderRepository serviceHeaderRepository;


    @PostMapping
    public ServiceHeader create(@RequestBody ServiceHeader serviceHeader) {
        return serviceHeaderRepository.save(serviceHeader);

    }

    @GetMapping
    public List<ServiceHeader> findAll() {
        return serviceHeaderRepository.findAll();
    }

    @PutMapping("/{id}")
    public ServiceHeader update(@RequestBody ServiceHeader serviceHeader) {
        return serviceHeaderRepository.save(serviceHeader);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable Long id) {
         serviceHeaderRepository.deleteById(id);

    }



}
