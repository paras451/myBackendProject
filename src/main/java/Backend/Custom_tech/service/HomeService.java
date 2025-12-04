package Backend.Custom_tech.service;


import Backend.Custom_tech.entity.Home;
import java.util.List;


public interface HomeService {

    List<Home> getAll();
    Home create(Home home);
    Home update(Long id, Home home);
    void delete(Long id);



}
