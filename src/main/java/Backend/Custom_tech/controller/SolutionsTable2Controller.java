package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.SolutionsTable2;
import Backend.Custom_tech.service.SolutionsTable2Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController 
@RequestMapping("/SolutionsTable2")
public class SolutionsTable2Controller {

    private final SolutionsTable2Service solutionsTable2Service;

    public SolutionsTable2Controller(SolutionsTable2Service solutionsTable2Service) {
        this.solutionsTable2Service = solutionsTable2Service;
    }

    @PostMapping
    public SolutionsTable2 create(@RequestBody SolutionsTable2 solutionsTable2) {
        return solutionsTable2Service.save(solutionsTable2);
    }

    @GetMapping
    public List<SolutionsTable2> getAll() {
        return solutionsTable2Service.getAll();

    }

    @PutMapping("/{id}")
    public SolutionsTable2 update(@RequestBody SolutionsTable2 SolutionsTable2, @PathVariable Long id) {
        return solutionsTable2Service.update(id ,SolutionsTable2);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        solutionsTable2Service.delete(id);
        return "Deleted Successfully";
    }
}
