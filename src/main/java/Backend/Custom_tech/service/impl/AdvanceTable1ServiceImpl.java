package Backend.Custom_tech.service.impl;


import Backend.Custom_tech.entity.AdvanceTable1;
import Backend.Custom_tech.repository.AdvanceTable1Repository;
import Backend.Custom_tech.service.AdvanceTable1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvanceTable1ServiceImpl implements AdvanceTable1Service {

    @Autowired
    private final AdvanceTable1Repository advanceTable1Repository;

    public AdvanceTable1ServiceImpl(AdvanceTable1Repository advanceTable1Repository) {
        this.advanceTable1Repository = advanceTable1Repository;
    }

    @Override
    public AdvanceTable1 save(AdvanceTable1 service) {
        return advanceTable1Repository.save(service);
    }

    @Override
    public List<AdvanceTable1> getAll() {
        return advanceTable1Repository.findAll();
    }

    @Override
    public AdvanceTable1 findById(Long id) {
        return advanceTable1Repository.findById(id).orElse(null) ;
    }

    @Override
    public AdvanceTable1 update(Long id, AdvanceTable1 service) {
        return advanceTable1Repository.findById(id).map(AdvanceTable1 -> {
            AdvanceTable1.setMainTitle(service.getMainTitle());
            AdvanceTable1.setDescription(service.getDescription());
            return advanceTable1Repository.save(AdvanceTable1);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        advanceTable1Repository.deleteById(id);
    }
}
