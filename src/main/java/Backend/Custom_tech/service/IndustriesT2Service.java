package Backend.Custom_tech.service;

import Backend.Custom_tech.entity.IndustriesT2;
import java.util.List;

public interface IndustriesT2Service {


    IndustriesT2 save(IndustriesT2 industriesT2);
    List<IndustriesT2> getAll();
    IndustriesT2 findById(Long id);
    IndustriesT2 update(Long id , IndustriesT2 industriesT2);
    void delete(Long id);
}
