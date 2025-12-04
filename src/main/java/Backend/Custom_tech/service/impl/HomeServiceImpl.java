package Backend.Custom_tech.service.impl;


import Backend.Custom_tech.entity.Home;
import Backend.Custom_tech.repository.HomeRepository;
import Backend.Custom_tech.service.HomeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {


    private final HomeRepository homeRepository;


    public HomeServiceImpl(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    @Override
    public List<Home> getAll() {
        return homeRepository.findAll();
    }

    @Override
    public Home create(Home home) {
        return homeRepository.save(home);
    }

    @Override
    public Home update(Long id, Home updatedHome) {
        Home home = homeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not Found"));

        home.setTitle(updatedHome.getTitle());
        home.setDescription(updatedHome.getDescription());

        return homeRepository.save(home);
    }

    @Override
    public void delete(Long id) {
        homeRepository.deleteById(id);

    }
}
