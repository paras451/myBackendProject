package Backend.Custom_tech.service;


import Backend.Custom_tech.entity.ContactT2;

import java.util.List;

public interface ContactT2Service {

    ContactT2 save(ContactT2 contactT2);
    List<ContactT2> getAll();
    ContactT2 findById(Long id);
    ContactT2 update(Long id , ContactT2 ContactT2);
    void delete(Long id);
}
