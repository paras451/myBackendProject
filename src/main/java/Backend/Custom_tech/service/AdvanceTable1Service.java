package Backend.Custom_tech.service;

import Backend.Custom_tech.entity.AdvanceTable1;
import Backend.Custom_tech.entity.ServiceItem;

import java.util.List;

public interface AdvanceTable1Service {
    AdvanceTable1 save(AdvanceTable1 advanceTable1);
//    List<AdvanceTable1> findAll();
    AdvanceTable1 findById(Long id);
    AdvanceTable1 update(Long id , AdvanceTable1 advanceTable1);
    void delete(Long id);

    List<AdvanceTable1> getAll();
}
