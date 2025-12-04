package Backend.Custom_tech.repository;


import Backend.Custom_tech.entity.ContactT3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactT3Repository extends JpaRepository <ContactT3, Long> {

}
