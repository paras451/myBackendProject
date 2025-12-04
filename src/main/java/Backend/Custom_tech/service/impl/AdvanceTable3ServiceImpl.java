package Backend.Custom_tech.service.impl;

import Backend.Custom_tech.entity.AdvanceTable3;
import Backend.Custom_tech.repository.AdvanceTable3Repository;
import Backend.Custom_tech.service.AdvanceTable3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvanceTable3ServiceImpl implements AdvanceTable3Service {

    @Autowired
    private final AdvanceTable3Repository advanceTable3Repository;

    public AdvanceTable3ServiceImpl(AdvanceTable3Repository advanceTable3Repository) {
        this.advanceTable3Repository = advanceTable3Repository;
    }
    @Override
    public AdvanceTable3 save(AdvanceTable3 service) {
        return advanceTable3Repository.save(service);
    }

    @Override
    public List<AdvanceTable3> getAllByPosition() {
        return advanceTable3Repository.findAllByOrderByPositionAsc();
    }

    @Override
    public AdvanceTable3 findById(Long id) {
        return advanceTable3Repository.findById(id).orElse(null);
    }

    @Override
    public AdvanceTable3 update(Long id, AdvanceTable3 service) {
        return advanceTable3Repository.findById(id).map(AdvanceTable3 -> {
            AdvanceTable3.setTitle(service.getTitle());
            AdvanceTable3.setDescription(service.getDescription());
            AdvanceTable3.setButton_text(service.getButton_text());
            return advanceTable3Repository.save(AdvanceTable3);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        advanceTable3Repository.deleteById(id);

    }
}
