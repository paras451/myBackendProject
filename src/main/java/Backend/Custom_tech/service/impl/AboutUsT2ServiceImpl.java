package Backend.Custom_tech.service.impl;

import Backend.Custom_tech.entity.AboutUsT2;
import Backend.Custom_tech.repository.AboutUsT2Repository;
import Backend.Custom_tech.service.AboutUsT2Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutUsT2ServiceImpl implements AboutUsT2Service {

    private final AboutUsT2Repository aboutUsT2Repository;

    public AboutUsT2ServiceImpl(AboutUsT2Repository aboutUsT2Repository) {
        this.aboutUsT2Repository = aboutUsT2Repository;
    }




    @Override
    public AboutUsT2 save(AboutUsT2 aboutUsT2) {
        return aboutUsT2Repository.save(aboutUsT2);
    }

    @Override
    public List<AboutUsT2> getAll() {
        return aboutUsT2Repository.findAll();
    }

    @Override
    public AboutUsT2 findById(Long id) {
        return aboutUsT2Repository.findById(id).orElse(null);
    }

    @Override
    public AboutUsT2 update(Long id, AboutUsT2 aboutUsT2) {
        return aboutUsT2Repository.findById(id).map(AboutUsT2 ->{
            AboutUsT2.setTitle(aboutUsT2.getTitle());
            AboutUsT2.setSub_title1(aboutUsT2.getSub_title1());
            AboutUsT2.setSub_description1(aboutUsT2.getSub_description1());
            AboutUsT2.setSub_title2(aboutUsT2.getSub_title2());
            AboutUsT2.setSub_description2(aboutUsT2.getSub_description2());
            AboutUsT2.setSub_title3(aboutUsT2.getSub_title3());
            AboutUsT2.setSub_description3(aboutUsT2.getSub_description3());
            return aboutUsT2Repository.save(aboutUsT2);

        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        aboutUsT2Repository.deleteById(id);

    }
}
