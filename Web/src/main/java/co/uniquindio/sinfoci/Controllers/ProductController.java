package co.uniquindio.sinfoci.Controllers;

import co.uniquindio.sinfoci.Entities.ClientOrder;
import co.uniquindio.sinfoci.Entities.Product;
import co.uniquindio.sinfoci.Entities.ProductDetail;
import co.uniquindio.sinfoci.ServiceImpl.ProductDetailImpl;
import co.uniquindio.sinfoci.ServiceImpl.ProductImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductImpl pdl;

    @GetMapping("/product.html")
    public ModelAndView listarProductos(@PageableDefault(sort = "name", size = 5) Pageable pageable){
        List<Product> products = pdl.listAllProducts();
        return new ModelAndView("product").addObject("products", products);
    }

    @GetMapping("/product/product_form.html")
    public String goToForm(){
        return "product_form";
    }
}
