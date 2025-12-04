package Backend.Custom_tech.service;


import Backend.Custom_tech.entity.Tech;
import Backend.Custom_tech.repository.TechRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechService {

    private final TechRepository techRepository;

    public TechService(TechRepository techRepository) {
        this.techRepository = techRepository;
    }
    public Tech save(Tech tech) {
        return techRepository.save(tech);
    }

    public List<Tech> findAll() {
        return techRepository.findAll();




    }


}
