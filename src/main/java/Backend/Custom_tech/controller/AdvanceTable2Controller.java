package Backend.Custom_tech.controller;

import Backend.Custom_tech.entity.AdvanceTable2;
import Backend.Custom_tech.service.AdvanceTable2Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Table2")
public class AdvanceTable2Controller {


    private final AdvanceTable2Service advanceTable2Service;


    public AdvanceTable2Controller(AdvanceTable2Service advanceTable2Service) {
        this.advanceTable2Service = advanceTable2Service;
    }

    @PostMapping
    public AdvanceTable2 create(@RequestBody AdvanceTable2 advanceTable2) {
        return advanceTable2Service.save(advanceTable2);
    }

    @GetMapping
    public List<AdvanceTable2> getAll() {
        return advanceTable2Service.getAllByPosition();

    }

    @PutMapping("/{id}")
    public AdvanceTable2 update(@RequestBody AdvanceTable2 advanceTable2, @PathVariable Long id) {
        return advanceTable2Service.update(id ,advanceTable2);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        advanceTable2Service.delete(id);
        return "Deleted Successfully";
    }
}
