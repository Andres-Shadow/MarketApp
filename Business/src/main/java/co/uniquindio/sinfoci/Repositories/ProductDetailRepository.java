package co.uniquindio.sinfoci.Repositories;

import co.uniquindio.sinfoci.Entities.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer> {
}