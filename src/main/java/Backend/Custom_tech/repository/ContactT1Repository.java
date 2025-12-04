package Backend.Custom_tech.repository;


import Backend.Custom_tech.entity.ContactT1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactT1Repository extends JpaRepository <ContactT1, Long> {

}
