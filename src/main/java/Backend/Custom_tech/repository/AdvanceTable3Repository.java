package Backend.Custom_tech.repository;


import Backend.Custom_tech.entity.AdvanceTable2;
import Backend.Custom_tech.entity.AdvanceTable3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvanceTable3Repository extends JpaRepository<AdvanceTable3, Long> {

    List<AdvanceTable3> findAllByOrderByPositionAsc();

}
