package Backend.Custom_tech.service.impl;


import Backend.Custom_tech.entity.SolutionsTable2;
import Backend.Custom_tech.repository.SolutionsTable2Repository;
import Backend.Custom_tech.service.SolutionsTable2Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolutionsTable2ServiceImpl implements SolutionsTable2Service {

    private final SolutionsTable2Repository solutionsTable2Repository;

    public SolutionsTable2ServiceImpl(SolutionsTable2Repository solutionsTable2Repository) {
        this.solutionsTable2Repository = solutionsTable2Repository;
    }




    @Override
    public SolutionsTable2 save(SolutionsTable2 solutionsTable2) {
        return solutionsTable2Repository.save(solutionsTable2);
    }

    @Override
    public List<SolutionsTable2> getAll() {
        return solutionsTable2Repository.findAll();
    }

    @Override
    public SolutionsTable2 findById(Long id) {
        return solutionsTable2Repository.findById(id).orElse(null);
    }

    @Override
    public SolutionsTable2 update(Long id, SolutionsTable2 solutionsTable2) {
        return solutionsTable2Repository.findById(id).map(SolutionsTable2 -> {
            SolutionsTable2.setTitle(solutionsTable2.getTitle());
            SolutionsTable2.setDescription(solutionsTable2.getDescription());
            SolutionsTable2.setIcon(solutionsTable2.getIcon());
            return solutionsTable2Repository.save(solutionsTable2);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        solutionsTable2Repository.deleteById(id);

    }
}
