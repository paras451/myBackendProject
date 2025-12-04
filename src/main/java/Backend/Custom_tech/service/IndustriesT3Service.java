package Backend.Custom_tech.service;

import Backend.Custom_tech.entity.IndustriesT3;
import java.util.List;

public interface IndustriesT3Service {


    IndustriesT3 save(IndustriesT3 industriesT3);
    List<IndustriesT3> getAll();
    IndustriesT3 findById(Long id);
    IndustriesT3 update(Long id , IndustriesT3 industriesT3);
    void delete(Long id);
}
