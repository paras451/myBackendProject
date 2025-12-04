package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.AboutUsT2;
import Backend.Custom_tech.service.AboutUsT2Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AboutT2")
public class AboutUsT2Controller {


    private final AboutUsT2Service aboutUsT2Service;

    public AboutUsT2Controller(AboutUsT2Service aboutUsT2Service) {
        this.aboutUsT2Service = aboutUsT2Service;
    }

    @PostMapping
    public AboutUsT2 create(@RequestBody AboutUsT2 aboutUsT2) {
        return aboutUsT2Service.save(aboutUsT2);
    }
    @GetMapping
    public List<AboutUsT2> getAll() {
        return aboutUsT2Service.getAll();

    }

    @PutMapping("/{id}")
    public AboutUsT2 update(@RequestBody AboutUsT2 aboutUsT2, @PathVariable Long id) {
        return aboutUsT2Service.update(id ,aboutUsT2);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        aboutUsT2Service.delete(id);
        return "Deleted Successfully";
    }
}
