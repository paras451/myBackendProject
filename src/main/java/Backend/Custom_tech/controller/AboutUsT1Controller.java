package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.AboutUsT1;
import Backend.Custom_tech.service.AboutUsT1Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AboutT1")
public class AboutUsT1Controller {
    
   
    private final AboutUsT1Service aboutUsT1Service;

    public AboutUsT1Controller(AboutUsT1Service aboutUsT1Service) {
        this.aboutUsT1Service = aboutUsT1Service;
    }

    @PostMapping
    public AboutUsT1 create(@RequestBody AboutUsT1 aboutUsT1) {
        return aboutUsT1Service.save(aboutUsT1);
    }

    @GetMapping
    public List<AboutUsT1> getAll() {
        return aboutUsT1Service.getAll();

    }

    @PutMapping("/{id}")
    public AboutUsT1 update(@RequestBody AboutUsT1 aboutUsT1, @PathVariable Long id) {
        return aboutUsT1Service.update(id ,aboutUsT1);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        aboutUsT1Service.delete(id);
        return "Deleted Successfully";
    }
}
