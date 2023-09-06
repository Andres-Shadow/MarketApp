package co.uniquindio.sinfoci.Repositories;

import co.uniquindio.sinfoci.Entities.ClientOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientOrderRepository extends JpaRepository<ClientOrder, Integer> {
}