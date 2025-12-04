package Backend.Custom_tech.service.impl;

import Backend.Custom_tech.entity.SolutionsTable1;
import Backend.Custom_tech.repository.SolutionsTable1Repository;
import Backend.Custom_tech.service.SolutionsTable1Service;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SolutionsTable1ServiceImpl implements SolutionsTable1Service {

    private final SolutionsTable1Repository solutionsTable1Repository;

    public SolutionsTable1ServiceImpl(SolutionsTable1Repository solutionsTable1Repository) {
        this.solutionsTable1Repository = solutionsTable1Repository;
    }




    @Override
    public SolutionsTable1 save(SolutionsTable1 solutionsTable1) {
        return solutionsTable1Repository.save(solutionsTable1);
    }

    @Override
    public List<SolutionsTable1> getAll() {
        return solutionsTable1Repository.findAll();
    }

    @Override
    public SolutionsTable1 findById(Long id) {
        return solutionsTable1Repository.findById(id).orElse(null);
    }

    @Override
    public SolutionsTable1 update(Long id, SolutionsTable1 solutionsTable1) {
        return solutionsTable1Repository.findById(id).map(SolutionsTable1 -> {
            SolutionsTable1.setTitle(solutionsTable1.getTitle());
            SolutionsTable1.setDescription(solutionsTable1.getDescription());
            return solutionsTable1Repository.save(solutionsTable1);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        solutionsTable1Repository.deleteById(id);

    }
}
