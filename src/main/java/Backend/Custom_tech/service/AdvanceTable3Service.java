package Backend.Custom_tech.service;

import Backend.Custom_tech.entity.AdvanceTable2;
import Backend.Custom_tech.entity.AdvanceTable3;

import java.util.List;

public interface AdvanceTable3Service {
    AdvanceTable3 save(AdvanceTable3 advanceTable3);
//    List<AdvanceTable3> getAll();
    AdvanceTable3 findById(Long id);
    AdvanceTable3 update(Long id , AdvanceTable3 advanceTable3);
    void delete(Long id);

    List<AdvanceTable3> getAllByPosition();
}
