package Backend.Custom_tech.repository;


import Backend.Custom_tech.entity.AdvanceTable1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvanceTable1Repository extends JpaRepository<AdvanceTable1, Long> {

//    List<AdvanceTable1> getAll();
}
