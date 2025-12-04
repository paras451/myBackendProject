package Backend.Custom_tech.repository;

import Backend.Custom_tech.entity.AdvanceTable2;
import Backend.Custom_tech.entity.ServiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvanceTable2Repository extends JpaRepository<AdvanceTable2, Long> {

    List<AdvanceTable2> findAllByOrderByPositionAsc();
}
