package Backend.Custom_tech.repository;

import Backend.Custom_tech.entity.SolutionsTable1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SolutionsTable1Repository extends JpaRepository <SolutionsTable1, Long> {

}
