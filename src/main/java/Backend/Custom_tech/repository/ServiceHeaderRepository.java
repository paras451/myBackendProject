package Backend.Custom_tech.repository;


import Backend.Custom_tech.entity.ServiceHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceHeaderRepository  extends JpaRepository<ServiceHeader,Long> {
}
