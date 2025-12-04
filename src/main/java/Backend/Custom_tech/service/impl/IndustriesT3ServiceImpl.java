package Backend.Custom_tech.service.impl;

import Backend.Custom_tech.entity.IndustriesT3;
import Backend.Custom_tech.repository.IndustriesT3Repository;
import Backend.Custom_tech.service.IndustriesT3Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndustriesT3ServiceImpl implements IndustriesT3Service {

    private final IndustriesT3Repository industriesT3Repository;


    public IndustriesT3ServiceImpl(IndustriesT3Repository industriesT3Repository){
        this.industriesT3Repository = industriesT3Repository;
    }


    @Override
    public IndustriesT3 save(IndustriesT3 industriesT3) {
        return industriesT3Repository.save(industriesT3);
    }

    @Override
    public List<IndustriesT3> getAll() {
        return industriesT3Repository.findAll();
    }

    @Override
    public IndustriesT3 findById(Long id) {
        return industriesT3Repository.findById(id).orElse(null);
    }

    @Override
    public IndustriesT3 update(Long id, IndustriesT3 industriesT3) {
        return industriesT3Repository.findById(id).map(IndustriesT3 ->{
            IndustriesT3.setTitle(industriesT3.getTitle());
            IndustriesT3.setDescription(industriesT3.getDescription());
            IndustriesT3.setIcon(industriesT3.getIcon());
            IndustriesT3.setIcon_desc(industriesT3.getIcon_desc());
            return industriesT3Repository.save(industriesT3);

        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        industriesT3Repository.deleteById(id);

    }
}
