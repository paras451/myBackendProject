package Backend.Custom_tech.service;

import Backend.Custom_tech.entity.SolutionsTable1;

import java.util.List;

public interface SolutionsTable1Service {

    SolutionsTable1 save(SolutionsTable1 solutionsTable1);
    List<SolutionsTable1> getAll();
    SolutionsTable1 findById(Long id);
    SolutionsTable1 update(Long id , SolutionsTable1 solutionsTable1);
    void delete(Long id);
}
