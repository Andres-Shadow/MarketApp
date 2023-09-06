package co.uniquindio.sinfoci.Repositories;

import co.uniquindio.sinfoci.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}