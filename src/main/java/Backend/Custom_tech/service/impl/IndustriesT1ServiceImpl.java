package Backend.Custom_tech.service.impl;


import Backend.Custom_tech.entity.IndustriesT1;
import Backend.Custom_tech.repository.IndustriesT1Repository;
import Backend.Custom_tech.service.IndustriesT1Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndustriesT1ServiceImpl implements IndustriesT1Service {

    private final IndustriesT1Repository industriesT1Repository;

    public IndustriesT1ServiceImpl(IndustriesT1Repository industriesT1Repository){
        this.industriesT1Repository = industriesT1Repository;
    }


    @Override
    public IndustriesT1 save(IndustriesT1 industriesT1) {
        return industriesT1Repository.save(industriesT1);
    }

    @Override
    public List<IndustriesT1> getAll() {
        return industriesT1Repository.findAll();
    }

    @Override
    public IndustriesT1 findById(Long id) {
        return industriesT1Repository.findById(id).orElse(null);
    }

    @Override
    public IndustriesT1 update(Long id, IndustriesT1 industriesT1) {
        return industriesT1Repository.findById(id).map(IndustriesT1 -> {
            IndustriesT1.setTitle(industriesT1.getTitle());
            IndustriesT1.setDescription(industriesT1.getDescription());
            IndustriesT1.setSub_title1(industriesT1.getSub_title1());
            IndustriesT1.setSub_description1(industriesT1.getSub_description1());
            IndustriesT1.setSub_title2(industriesT1.getSub_title2());
            IndustriesT1.setSub_description2(industriesT1.getSub_description2());
            return industriesT1Repository.save(industriesT1);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        industriesT1Repository.deleteById(id);

    }
}
