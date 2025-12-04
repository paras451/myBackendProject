package Backend.Custom_tech.service.impl;


import Backend.Custom_tech.entity.ContactT3;
import Backend.Custom_tech.repository.ContactT3Repository;
import Backend.Custom_tech.service.ContactT3Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactT3ServiceImpl  implements ContactT3Service {

    private final ContactT3Repository contactT3Repository;

    public  ContactT3ServiceImpl(ContactT3Repository contactT3Repository) {
        this.contactT3Repository = contactT3Repository;

    }


    @Override
    public ContactT3 save(ContactT3 contactT3) {
        return contactT3Repository.save(contactT3);
    }

    @Override
    public List<ContactT3> getAll() {
        return contactT3Repository.findAll();
    }

    @Override
    public ContactT3 findById(Long id) {
        return contactT3Repository.findById(id).orElse(null);
    }

    @Override
    public ContactT3 update(Long id, ContactT3 contactT3) {
        return contactT3Repository.findById(id).map(ContactT3 -> {
            ContactT3.setTitle(contactT3.getTitle());
            ContactT3.setText_1(contactT3.getText_1());
            ContactT3.setText_2(contactT3.getText_2());
            ContactT3.setText_3(contactT3.getText_3());
            ContactT3.setText_4(contactT3.getText_4());
            return contactT3Repository.save(ContactT3);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        contactT3Repository.deleteById(id);

    }
}
