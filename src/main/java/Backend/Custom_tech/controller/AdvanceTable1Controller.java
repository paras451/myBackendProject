package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.AdvanceTable1;

import Backend.Custom_tech.service.AdvanceTable1Service;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Table1")
public class AdvanceTable1Controller {
    
    private final AdvanceTable1Service advanceTable1Service;


    public AdvanceTable1Controller(AdvanceTable1Service advanceTable1Service) {
        this.advanceTable1Service = advanceTable1Service;
    }

    @PostMapping
    public AdvanceTable1 create(@RequestBody AdvanceTable1 advanceTable1) {
        return advanceTable1Service.save(advanceTable1);
    }

    @GetMapping
    public List<AdvanceTable1> getAll() {
        return advanceTable1Service.getAll();

    }

    @PutMapping("/{id}")
    public AdvanceTable1 update(@RequestBody AdvanceTable1 advanceTable1, @PathVariable Long id) {
        return advanceTable1Service.update(id ,advanceTable1);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        advanceTable1Service.delete(id);
        return "Deleted Successfully";
    }
}
