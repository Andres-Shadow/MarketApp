package co.uniquindio.sinfoci.Services;

import co.uniquindio.sinfoci.Entities.ProductDetail;

import java.util.List;

public interface ProductDetailService {

    //CRUD

    ProductDetail createProductDetail(ProductDetail detail);
    void deleteProductDetail(Integer detailId);
    ProductDetail updateProductDetail(ProductDetail newDetail);
    List<ProductDetail> listAllDetails();
    ProductDetail getProductDetail(Integer detailId);
}
