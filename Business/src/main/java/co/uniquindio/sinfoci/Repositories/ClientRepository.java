package co.uniquindio.sinfoci.Repositories;

import co.uniquindio.sinfoci.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    @Query("select name from Client  where name = :name")
    Client obtainByName(String name);
}