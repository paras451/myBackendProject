package Backend.Custom_tech.service;

import Backend.Custom_tech.entity.AboutUsT1;


import java.util.List;

public interface AboutUsT1Service {
    AboutUsT1 save(AboutUsT1 aboutUsT1);
    List<AboutUsT1> getAll();
    AboutUsT1 findById(Long id);
    AboutUsT1 update(Long id , AboutUsT1 aboutUsT1);
    void delete(Long id);
}
