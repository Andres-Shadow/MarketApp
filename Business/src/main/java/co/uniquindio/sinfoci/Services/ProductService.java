package co.uniquindio.sinfoci.Services;

import co.uniquindio.sinfoci.Entities.Product;

import java.util.List;

public interface ProductService {

    //CRUD

    Product createProduct(Product product);
    void deleteProduct(Integer productId);
    Product updateProduct(Product newProduct);
    List<Product> listAllProducts();
    Product getProduct(Integer productId);
}
