package Backend.Custom_tech.controller;


import Backend.Custom_tech.entity.ServiceItem;
import Backend.Custom_tech.service.ServiceItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceItemController {

    private final ServiceItemService serviceItemService;

    public ServiceItemController(ServiceItemService serviceItemService) {
        this.serviceItemService = serviceItemService;
    }


    @PostMapping
    public ServiceItem create(@RequestBody ServiceItem serviceItem) {
        return serviceItemService.save(serviceItem);
    }

    @GetMapping
    public List<ServiceItem> getAll() {
        return serviceItemService.getAllByPosition();

    }

    @PutMapping("/{id}")
    public ServiceItem update(@RequestBody ServiceItem serviceItem, @PathVariable Long id) {
        return serviceItemService.update(id ,serviceItem);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        serviceItemService.delete(id);
        return "Deleted Successfully";
    }



}
