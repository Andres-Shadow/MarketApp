package co.uniquindio.sinfoci.ServiceImpl;

import co.uniquindio.sinfoci.Entities.Client;
import co.uniquindio.sinfoci.Repositories.ClientRepository;
import co.uniquindio.sinfoci.Services.ClientService;

import java.util.List;
import java.util.Optional;

public class ClientServiceImpl implements ClientService {

    //DATA REPOSITORIES

    private ClientRepository clientRepo;

    private ClientServiceImpl(ClientRepository clientRepo){
        this.clientRepo = clientRepo;
    }

    @Override
    public Client createClient(Client newClient) {
        Client savedClient = null;
        savedClient = clientRepo.save(newClient);
        return  savedClient;
    }

    @Override
    public void deleteCliente(Integer clientId) {
        Optional<Client> found = clientRepo.findById(clientId);
        if (!found.isEmpty()) {
            clientRepo.delete(found.get());
        }
    }

    @Override
    public Client updateClient(Client newClient) {
        Optional<Client> found = clientRepo.findById(newClient.getID());
        Client saved = null;
        if(!found.isEmpty()){
            saved = clientRepo.save(newClient);
        }
        return saved;
    }

    @Override
    public List<Client> listAllClients() {
        return clientRepo.findAll();
    }

    @Override
    public Client getClient(Integer clientId) {
        Optional<Client> found = clientRepo.findById(clientId);
        if(!found.isEmpty()){
            return found.get();
        }else{
            return null;
        }
    }
}
