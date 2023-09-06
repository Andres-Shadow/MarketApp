package co.uniquindio.sinfoci.Services;

import co.uniquindio.sinfoci.Entities.ClientOrder;

import java.util.List;

public interface ClientOrderService {

    //CRUD
    ClientOrder createClientOrder(ClientOrder order);
    void deleteClientOrder(Integer orderId);
    ClientOrder updateClientOrder(ClientOrder newOrder);
    List<ClientOrder> listAllOrders();
    ClientOrder getOrder(Integer orderId);
}
