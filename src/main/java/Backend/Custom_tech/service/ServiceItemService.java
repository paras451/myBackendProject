package Backend.Custom_tech.service;


import Backend.Custom_tech.entity.ServiceItem;
import java.util.List;

public interface ServiceItemService {
    ServiceItem save(ServiceItem serviceItem);
//    List<ServiceItem> getAll();
    ServiceItem findById(Long id);
    ServiceItem update( Long id ,ServiceItem serviceItem);
    void delete(Long id);

    List<ServiceItem> getAllByPosition();
}
