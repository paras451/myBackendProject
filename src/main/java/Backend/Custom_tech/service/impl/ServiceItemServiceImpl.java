package Backend.Custom_tech.service.impl;


import Backend.Custom_tech.entity.ServiceItem;
import Backend.Custom_tech.repository.ServiceItemRepository;
import Backend.Custom_tech.service.ServiceItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceItemServiceImpl  implements ServiceItemService{


    @Autowired
    private final ServiceItemRepository serviceItemRepository;

    public ServiceItemServiceImpl(ServiceItemRepository serviceItemRepository) {
        this.serviceItemRepository = serviceItemRepository;
    }


    @Override
    public ServiceItem save(ServiceItem service) {
        return serviceItemRepository.save(service);
    }


    @Override
    public List<ServiceItem> getAllByPosition() {
        return serviceItemRepository.findAllByOrderByPositionAsc();
    }

    @Override
    public ServiceItem findById(Long id) {
        return serviceItemRepository.findById(id).orElse(null) ;
    }



    @Override
    public ServiceItem update(Long id, ServiceItem service) {
        return serviceItemRepository.findById(id).map(ServiceItem -> {
            ServiceItem.setMainTitle(service.getMainTitle());
            ServiceItem.setDescription(service.getDescription());
            return serviceItemRepository.save(ServiceItem);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        serviceItemRepository.deleteById(id);
    }




}
