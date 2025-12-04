package Backend.Custom_tech.service.impl;


import Backend.Custom_tech.entity.ContactT1;
import Backend.Custom_tech.entity.ContactT2;
import Backend.Custom_tech.repository.ContactT1Repository;
import Backend.Custom_tech.repository.ContactT2Repository;
import Backend.Custom_tech.service.ContactT1Service;
import Backend.Custom_tech.service.ContactT2Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactT2ServiceImpl implements ContactT2Service {


    private final ContactT2Repository contactT2Repository;

    public ContactT2ServiceImpl(ContactT2Repository contactT2Repository) {
        this.contactT2Repository = contactT2Repository;
    }

    @Override
    public ContactT2 save(ContactT2 contactT2) {
        return contactT2Repository.save(contactT2);
    }

    @Override
    public List<ContactT2> getAll() {
        return contactT2Repository.findAll();
    }

    @Override
    public ContactT2 findById(Long id) {
        return contactT2Repository.findById(id).orElse(null);
    }

    @Override
    public ContactT2 update(Long id, ContactT2 contactT2) {
        return contactT2Repository.findById(id).map(ContactT2 -> {
            ContactT2.setTitle(contactT2.getTitle());
            ContactT2.setName(contactT2.getName());
            ContactT2.setEmail(contactT2.getEmail());
            ContactT2.setMessage(contactT2.getMessage());
            ContactT2.setButton_text(contactT2.getButton_text());
            return contactT2Repository.save(contactT2);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        contactT2Repository.deleteById(id);

    }
}
