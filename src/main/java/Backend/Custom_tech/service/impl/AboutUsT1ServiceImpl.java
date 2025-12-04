package Backend.Custom_tech.service.impl;

import Backend.Custom_tech.entity.AboutUsT1;
import Backend.Custom_tech.repository.AboutUsT1Repository;
import Backend.Custom_tech.service.AboutUsT1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AboutUsT1ServiceImpl implements AboutUsT1Service {



    private final AboutUsT1Repository aboutUsT1Repository;

    public AboutUsT1ServiceImpl(AboutUsT1Repository aboutUsT1Repository) {
        this.aboutUsT1Repository = aboutUsT1Repository;
    }


    @Override
    public AboutUsT1 save(AboutUsT1 aboutUsT1) {
        return aboutUsT1Repository.save(aboutUsT1);
    }

    @Override
    public List<AboutUsT1> getAll() {
        return aboutUsT1Repository.findAll();
    }

    @Override
    public AboutUsT1 findById(Long id) {
        return aboutUsT1Repository.findById(id).orElse(null);
    }

    @Override
    public AboutUsT1 update(Long id, AboutUsT1 aboutUsT1) {
        return aboutUsT1Repository.findById(id).map(AboutUsT1 ->{
            AboutUsT1.setTitle(aboutUsT1.getTitle());
            AboutUsT1.setDescriptions(aboutUsT1.getDescriptions());
            AboutUsT1.setSub_title1(aboutUsT1.getSub_title1());
            AboutUsT1.setSub_description1(aboutUsT1.getSub_description1());
            AboutUsT1.setSub_title2(aboutUsT1.getSub_title2());
            AboutUsT1.setSub_description2(aboutUsT1.getSub_description2());
            return aboutUsT1Repository.save(aboutUsT1);
                }).orElse(null);

    }

    @Override
    public void delete(Long id) {
        aboutUsT1Repository.deleteById(id);

    }
}
