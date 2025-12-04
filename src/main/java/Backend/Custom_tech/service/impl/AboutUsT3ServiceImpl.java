package Backend.Custom_tech.service.impl;


import Backend.Custom_tech.entity.AboutUsT3;

import Backend.Custom_tech.repository.AboutUsT3Repository;
import Backend.Custom_tech.service.AboutUsT3Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutUsT3ServiceImpl implements AboutUsT3Service {

    private final AboutUsT3Repository aboutUsT3Repository;

    public AboutUsT3ServiceImpl(AboutUsT3Repository aboutUsT3Repository) {
        this.aboutUsT3Repository = aboutUsT3Repository;
    }




    @Override
    public AboutUsT3 save(AboutUsT3 aboutUsT3) {
        return aboutUsT3Repository.save(aboutUsT3);
    }

    @Override
    public List<AboutUsT3> getAll() {
        return aboutUsT3Repository.findAll();
    }

    @Override
    public AboutUsT3 findById(Long id) {
        return aboutUsT3Repository.findById(id).orElse(null);
    }

    @Override
    public AboutUsT3 update(Long id, AboutUsT3 aboutUsT3) {
        return aboutUsT3Repository.findById(id).map(AboutUsT3 ->{
            AboutUsT3.setTitle(aboutUsT3.getTitle());
            AboutUsT3.setDescription(aboutUsT3.getDescription());
            AboutUsT3.setSub_title1(aboutUsT3.getSub_title1());
            AboutUsT3.setSub_description1(aboutUsT3.getSub_description1());
            AboutUsT3.setSub_title2(aboutUsT3.getSub_description2());
            AboutUsT3.setSub_description2(aboutUsT3.getSub_description2());
            AboutUsT3.setSub_title3(aboutUsT3.getSub_description3());
            AboutUsT3.setSub_description3(aboutUsT3.getSub_description3());
            return aboutUsT3Repository.save(aboutUsT3);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        aboutUsT3Repository.deleteById(id);

    }
}
