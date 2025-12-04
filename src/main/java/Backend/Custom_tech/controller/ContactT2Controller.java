package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.ContactT2;
import Backend.Custom_tech.service.ContactT2Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ContactT2")
public class ContactT2Controller {
    
    
    private final ContactT2Service contactT2Service;
    
    public ContactT2Controller(ContactT2Service contactT2Service) {
        this.contactT2Service = contactT2Service;
    }
    @PostMapping
    public ContactT2 create(@RequestBody ContactT2 contactT2) {
        return contactT2Service.save(contactT2);
    }

    @GetMapping
    public List<ContactT2> getAll() {
        return contactT2Service.getAll();

    }

    @PutMapping("/{id}")
    public ContactT2 update(@RequestBody ContactT2 contactT2, @PathVariable Long id) {
        return contactT2Service.update(id ,contactT2);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        contactT2Service.delete(id);
        return "Deleted Successfully";
    }
    
}
