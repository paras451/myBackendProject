package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.ContactT1;
import Backend.Custom_tech.service.ContactT1Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ContactT1")
public class ContactT1Controller {

    private final ContactT1Service contactT1Service;

    public ContactT1Controller(ContactT1Service contactT1Service) {
        this.contactT1Service = contactT1Service;
    }

    @PostMapping
    public ContactT1 create(@RequestBody ContactT1 contactT1) {
        return contactT1Service.save(contactT1);
    }

    @GetMapping
    public List<ContactT1> getAll() {
        return contactT1Service.getAll();

    }

    @PutMapping("/{id}")
    public ContactT1 update(@RequestBody ContactT1 contactT1, @PathVariable Long id) {
        return contactT1Service.update(id ,contactT1);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        contactT1Service.delete(id);
        return "Deleted Successfully";
    }


}
