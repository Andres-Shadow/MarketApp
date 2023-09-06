package co.uniquindio.sinfoci.Repositories;

import co.uniquindio.sinfoci.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}