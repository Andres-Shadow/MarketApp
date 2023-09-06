package co.uniquindio.sinfoci.Services;

import co.uniquindio.sinfoci.Entities.Client;

import java.util.List;

public interface ClientService {

    //CRUD

    Client createClient(Client newClient);
    void deleteCliente(Integer clientId);
    Client updateClient(Client newClient);
    List<Client> listAllClients();
    Client getClient(Integer clientId);
}
