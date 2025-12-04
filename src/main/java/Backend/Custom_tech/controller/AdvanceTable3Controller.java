package Backend.Custom_tech.controller;

import Backend.Custom_tech.entity.AdvanceTable3;
import Backend.Custom_tech.service.AdvanceTable3Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Table3")
public class AdvanceTable3Controller {

    private final AdvanceTable3Service advanceTable3Service;


    public AdvanceTable3Controller(AdvanceTable3Service advanceTable3Service) {
        this.advanceTable3Service = advanceTable3Service;
    }

    @PostMapping
    public AdvanceTable3 create(@RequestBody AdvanceTable3 advanceTable3) {
        return advanceTable3Service.save(advanceTable3);
    }

    @GetMapping
    public List<AdvanceTable3> getAll() {
        return advanceTable3Service.getAllByPosition();

    }

    @PutMapping("/{id}")
    public AdvanceTable3 update(@RequestBody AdvanceTable3 advanceTable3, @PathVariable Long id) {
        return advanceTable3Service.update(id ,advanceTable3);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        advanceTable3Service.delete(id);
        return "Deleted Successfully";
    }
}
