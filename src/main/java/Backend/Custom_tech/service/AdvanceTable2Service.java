package Backend.Custom_tech.service;

import Backend.Custom_tech.entity.AdvanceTable1;
import Backend.Custom_tech.entity.AdvanceTable2;
import Backend.Custom_tech.entity.ServiceItem;

import java.util.List;

public interface AdvanceTable2Service {
    AdvanceTable2 save(AdvanceTable2 advanceTable2);
//    List<AdvanceTable2> getAll();
//    AdvanceTable2 findById(Long id);
    AdvanceTable2 update(Long id , AdvanceTable2 advanceTable2);
    void delete(Long id);

    List<AdvanceTable2> getAllByPosition();
}
