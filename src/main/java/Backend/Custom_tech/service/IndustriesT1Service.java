package Backend.Custom_tech.service;

import Backend.Custom_tech.entity.IndustriesT1;

import java.util.List;

public interface IndustriesT1Service {

    IndustriesT1 save(IndustriesT1 industriesT1);
    List<IndustriesT1> getAll();
    IndustriesT1 findById(Long id);
    IndustriesT1 update(Long id , IndustriesT1 industriesT1);
    void delete(Long id);
}
