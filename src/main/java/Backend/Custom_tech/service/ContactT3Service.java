package Backend.Custom_tech.service;

import Backend.Custom_tech.entity.ContactT3;
import java.util.List;

public interface ContactT3Service {


    ContactT3 save(ContactT3 contactT3);
    List<ContactT3> getAll();
    ContactT3 findById(Long id);
    ContactT3 update(Long id , ContactT3 ContactT3);
    void delete(Long id);
}
