package Backend.Custom_tech.service.impl;


import Backend.Custom_tech.entity.ContactT1;
import Backend.Custom_tech.repository.ContactT1Repository;
import Backend.Custom_tech.service.ContactT1Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactT1ServiceImpl implements ContactT1Service {

    private final ContactT1Repository  contactT1Repository;


    public ContactT1ServiceImpl(ContactT1Repository contactT1Repository) {
        this.contactT1Repository = contactT1Repository;
    }



    @Override
    public ContactT1 save(ContactT1 contactT1) {
        return contactT1Repository.save(contactT1);
    }

    @Override
    public List<ContactT1> getAll() {
        return contactT1Repository.findAll();
    }

    @Override
    public ContactT1 findById(Long id) {
        return contactT1Repository.findById(id).orElse(null);
    }

    @Override
    public ContactT1 update(Long id, ContactT1 contactT1) {
        return contactT1Repository.findById(id).map(ContactT1 -> {
            ContactT1.setTitle(contactT1.getTitle());
            ContactT1.setDescription(contactT1.getDescription());
            return contactT1Repository.save(contactT1);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        contactT1Repository.deleteById(id);

    }
}
