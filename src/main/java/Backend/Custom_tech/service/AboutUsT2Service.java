package Backend.Custom_tech.service;

import Backend.Custom_tech.entity.AboutUsT2;

import java.util.List;

public interface AboutUsT2Service {

    AboutUsT2 save(AboutUsT2 aboutUsT2);
    List<AboutUsT2> getAll();
    AboutUsT2 findById(Long id);
    AboutUsT2 update(Long id , AboutUsT2 aboutUsT2);
    void delete(Long id);
}
