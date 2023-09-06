package co.uniquindio.sinfoci.ServiceImpl;

import co.uniquindio.sinfoci.Entities.Product;
import co.uniquindio.sinfoci.Repositories.ProductRepository;
import co.uniquindio.sinfoci.Services.ProductService;

import java.util.List;
import java.util.Optional;

public class ProductImpl implements ProductService {

    //DATA REPOSITORIES

    private ProductRepository productRepo;

    public ProductImpl(ProductRepository productRepo){
        this.productRepo = productRepo;
    }


    @Override
    public Product createProduct(Product product) {
        Product savedProduct = null;
        savedProduct = productRepo.save(product);
        return savedProduct;
    }

    @Override
    public void deleteProduct(Integer productId) {
        Optional<Product> found = productRepo.findById(productId);
        if (!found.isEmpty()){
            productRepo.delete(found.get());
        }
    }

    @Override
    public Product updateProduct(Product newProduct) {
        Optional<Product> found = productRepo.findById(newProduct.getId());
        Product saved = null;
        if (!found.isEmpty()){
            saved = productRepo.save(newProduct);
        }
        return saved;
    }

    @Override
    public List<Product> listAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProduct(Integer productId) {
        Optional<Product> found = productRepo.findById(productId);
        if (!found.isEmpty()){
            return  found.get();
        }else{
            return  null;
        }
    }
}
