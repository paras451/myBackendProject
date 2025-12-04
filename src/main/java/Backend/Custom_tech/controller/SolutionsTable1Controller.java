package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.SolutionsTable1;
import Backend.Custom_tech.service.SolutionsTable1Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SolutionsTable1")
public class SolutionsTable1Controller {

    private final SolutionsTable1Service solutionsTable1Service;

    public SolutionsTable1Controller(SolutionsTable1Service solutionsTable1Service) {
        this.solutionsTable1Service = solutionsTable1Service;
    }

    @PostMapping
    public SolutionsTable1 create(@RequestBody SolutionsTable1 solutionsTable1) {
        return solutionsTable1Service.save(solutionsTable1);
    }

    @GetMapping
    public List<SolutionsTable1> getAll() {
        return solutionsTable1Service.getAll();

    }

    @PutMapping("/{id}")
    public SolutionsTable1 update(@RequestBody SolutionsTable1 SolutionsTable1, @PathVariable Long id) {
        return solutionsTable1Service.update(id ,SolutionsTable1);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        solutionsTable1Service.delete(id);
        return "Deleted Successfully";
    }
}
