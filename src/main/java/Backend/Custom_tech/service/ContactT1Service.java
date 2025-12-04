package Backend.Custom_tech.service;

import Backend.Custom_tech.entity.ContactT1;
import java.util.List;

public interface ContactT1Service {

    ContactT1 save(ContactT1 contactT1);
    List<ContactT1> getAll();
    ContactT1 findById(Long id);
    ContactT1 update(Long id , ContactT1 ContactT1);
    void delete(Long id);
}
