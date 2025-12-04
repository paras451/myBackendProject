package Backend.Custom_tech.service;

import Backend.Custom_tech.entity.SolutionsTable2;

import java.util.List;

public interface SolutionsTable2Service {

    SolutionsTable2 save(SolutionsTable2 solutionsTable2);
    List<SolutionsTable2> getAll();
    SolutionsTable2 findById(Long id);
    SolutionsTable2 update(Long id , SolutionsTable2 solutionsTable2);
    void delete(Long id);
}
