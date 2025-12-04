package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.AboutUsT3;
import Backend.Custom_tech.service.AboutUsT3Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AboutT3")
public class AboutUsT3Controller {

    private final AboutUsT3Service aboutUsT3Service;

    public AboutUsT3Controller(AboutUsT3Service aboutUsT3Service) {
        this.aboutUsT3Service = aboutUsT3Service;
    }


    @PostMapping
    public AboutUsT3 create(@RequestBody AboutUsT3 aboutUsT3) {
        return aboutUsT3Service.save(aboutUsT3);
    }
    @GetMapping
    public List<AboutUsT3> getAll() {
        return aboutUsT3Service.getAll();

    }

    @PutMapping("/{id}")
    public AboutUsT3 update(@RequestBody AboutUsT3 aboutUsT3, @PathVariable Long id) {
        return aboutUsT3Service.update(id ,aboutUsT3);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        aboutUsT3Service.delete(id);
        return "Deleted Successfully";
    }
}
