package Backend.Custom_tech.service;

import Backend.Custom_tech.entity.AboutUsT3;

import java.util.List;

public interface AboutUsT3Service {
    AboutUsT3 save(AboutUsT3 aboutUsT3);
    List<AboutUsT3> getAll();
    AboutUsT3 findById(Long id);
    AboutUsT3 update(Long id , AboutUsT3 aboutUsT3);
    void delete(Long id);
}
