package co.uniquindio.sinfoci.ServiceImpl;

import co.uniquindio.sinfoci.Entities.ProductDetail;
import co.uniquindio.sinfoci.Repositories.ProductDetailRepository;
import co.uniquindio.sinfoci.Services.ProductDetailService;

import java.util.List;
import java.util.Optional;

public class ProductDetailImpl implements ProductDetailService {

    private ProductDetailRepository detailRepo;

    public ProductDetailImpl(ProductDetailRepository detailRepo){
        this.detailRepo = detailRepo;
    }
    @Override
    public ProductDetail createProductDetail(ProductDetail detail) {
        ProductDetail savedDetail = null;
        savedDetail = detailRepo.save(detail);
        return savedDetail;
    }

    @Override
    public void deleteProductDetail(Integer detailId) {
        Optional<ProductDetail> found = detailRepo.findById(detailId);
        if(!found.isEmpty()){
            detailRepo.delete(found.get());
        }
    }

    @Override
    public ProductDetail updateProductDetail(ProductDetail newDetail) {
        Optional<ProductDetail> found = detailRepo.findById(newDetail.getId());
        ProductDetail saved = null;
        if(!found.isEmpty()){
            saved = detailRepo.save(newDetail);
        }
        return saved;
    }

    @Override
    public List<ProductDetail> listAllDetails() {
        return detailRepo.findAll();
    }

    @Override
    public ProductDetail getProductDetail(Integer detailId) {
        Optional<ProductDetail> found = detailRepo.findById(detailId);
        if(!found.isEmpty()){
            return found.get();
        }else{
            return null;
        }
    }
}
