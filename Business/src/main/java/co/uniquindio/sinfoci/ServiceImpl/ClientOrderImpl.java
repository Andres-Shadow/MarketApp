package co.uniquindio.sinfoci.ServiceImpl;

import co.uniquindio.sinfoci.Entities.ClientOrder;
import co.uniquindio.sinfoci.Repositories.ClientOrderRepository;
import co.uniquindio.sinfoci.Services.ClientOrderService;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class ClientOrderImpl implements ClientOrderService {

    //DATA REPOSITORES

    private ClientOrderRepository orderRepo;

    public ClientOrderImpl(ClientOrderRepository orderRepo){
        this.orderRepo = orderRepo;
    }

    @Override
    public ClientOrder createClientOrder(ClientOrder order) {
        ClientOrder savedOrder = null;
        savedOrder = orderRepo.save(order);
        return savedOrder;
    }

    @Override
    public void deleteClientOrder(Integer orderId) {
        Optional<ClientOrder> found = orderRepo.findById(orderId);
        if(!found.isEmpty()){
            orderRepo.delete(found.get());
        }
    }

    @Override
    public ClientOrder updateClientOrder(ClientOrder newOrder) {
        Optional<ClientOrder> found = orderRepo.findById(newOrder.getId());
        ClientOrder saved = null;
        if(!found.isEmpty()){
            saved = orderRepo.save(newOrder);
        }
        return  saved;
    }

    @Override
    public List<ClientOrder> listAllOrders() {
        return orderRepo.findAll();
    }

    @Override
    public ClientOrder getOrder(Integer orderId) {
        Optional<ClientOrder> found = orderRepo.findById(orderId);
        if(!found.isEmpty()){
            return found.get();
        }else{
            return  null;
        }
    }
}
