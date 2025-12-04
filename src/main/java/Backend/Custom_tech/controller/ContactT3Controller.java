package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.ContactT3;
import Backend.Custom_tech.service.ContactT3Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ContactT3")
public class ContactT3Controller {
    
    private final ContactT3Service contactT3Service;
    
    public ContactT3Controller(ContactT3Service contactT3Service) {
        this.contactT3Service = contactT3Service;
    }

    @PostMapping
    public ContactT3 create(@RequestBody ContactT3 contactT3) {
        return contactT3Service.save(contactT3);
    }

    @GetMapping
    public List<ContactT3> getAll() {
        return contactT3Service.getAll();

    }

    @PutMapping("/{id}")
    public ContactT3 update(@RequestBody ContactT3 contactT3, @PathVariable Long id) {
        return contactT3Service.update(id ,contactT3);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        contactT3Service.delete(id);
        return "Deleted Successfully";
    }
}
