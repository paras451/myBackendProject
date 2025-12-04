package Backend.Custom_tech.service.impl;

import Backend.Custom_tech.entity.IndustriesT2;
import Backend.Custom_tech.repository.IndustriesT2Repository;
import Backend.Custom_tech.service.IndustriesT2Service;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IndustriesT2ServiceImpl implements IndustriesT2Service {

    private final IndustriesT2Repository  industriesT2Repository ;


    public IndustriesT2ServiceImpl(IndustriesT2Repository industriesT2Repository) {
        this.industriesT2Repository = industriesT2Repository;
    }






    @Override
    public IndustriesT2 save(IndustriesT2 industriesT2) {
        return industriesT2Repository.save(industriesT2);
    }

    @Override
    public List<IndustriesT2> getAll() {
        return industriesT2Repository.findAll();
    }

    @Override
    public IndustriesT2 findById(Long id) {
        return industriesT2Repository.findById(id).orElse(null);
    }

    @Override
    public IndustriesT2 update(Long id, IndustriesT2 industriesT2) {
        return industriesT2Repository.findById(id).map(IndustriesT2 -> {
            IndustriesT2.setColumn1(industriesT2.getColumn1());
            IndustriesT2.setColumn2(industriesT2.getColumn2());
            return industriesT2Repository.save(industriesT2);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        industriesT2Repository.deleteById(id);

    }
}
