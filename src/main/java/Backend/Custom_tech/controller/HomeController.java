package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.Home;
import Backend.Custom_tech.repository.HomeRepository;
import Backend.Custom_tech.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {


    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping
    public List<Home> getAll() {
        return homeService.getAll();
    }

    @PostMapping
    public Home create(@RequestBody Home home) {
        return homeService.create(home);
    }

    @PutMapping("/{id}")
    public Home update(@PathVariable Long id, @RequestBody Home home) {
        return homeService.update(id, home);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        homeService.delete(id);
        return "Deleted Successfully";
    }

}
