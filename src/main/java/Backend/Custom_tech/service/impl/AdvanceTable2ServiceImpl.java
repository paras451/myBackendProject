package Backend.Custom_tech.service.impl;

import Backend.Custom_tech.entity.AdvanceTable2;
import Backend.Custom_tech.entity.ServiceItem;
import Backend.Custom_tech.repository.AdvanceTable2Repository;
import Backend.Custom_tech.service.AdvanceTable2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvanceTable2ServiceImpl implements AdvanceTable2Service {

    @Autowired
    private final AdvanceTable2Repository advanceTable2Repository;

    public AdvanceTable2ServiceImpl(AdvanceTable2Repository advanceTable2Repository) {
        this.advanceTable2Repository = advanceTable2Repository;
    }

    @Override
    public AdvanceTable2 save(AdvanceTable2 service) {
        return  advanceTable2Repository.save(service);
    }

    @Override
    public List<AdvanceTable2> getAllByPosition() {
        return advanceTable2Repository.findAllByOrderByPositionAsc();
    }

//    @Override
//    public AdvanceTable2 findById(Long id) {
//        return advanceTable2Repository.findById(id).orElse(null) ;
//    }

    @Override
    public AdvanceTable2 update(Long id, AdvanceTable2 service) {
        return advanceTable2Repository.findById(id).map(AdvanceTable2 -> {
            AdvanceTable2.setTitle(service.getTitle());
            AdvanceTable2.setDescription(service.getDescription());
            return advanceTable2Repository.save(AdvanceTable2);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        advanceTable2Repository.deleteById(id);

    }
}
