package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.Tech;
import Backend.Custom_tech.repository.TechRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/contact")
public class TechController {

    @Autowired
    private  TechRepository techRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;



    @GetMapping
    public List<Tech> getAllUsers() {
        return techRepository.findAll();
    }


    @PostMapping
    public ResponseEntity<Tech> saveUser(@RequestBody Tech tech){
//        // Check if table is empty
//        if (techRepository.count() == 0) {
//            // Reset auto-increment only if table empty
//            jdbcTemplate.execute("ALTER TABLE tech AUTO_INCREMENT = 1");
//        }
        Tech saved = techRepository.save(tech);
        return ResponseEntity.ok(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        if (!techRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("User not found");
        }

        techRepository.deleteById(id);
        return ResponseEntity.ok("User deleted successfully");
    }
}

