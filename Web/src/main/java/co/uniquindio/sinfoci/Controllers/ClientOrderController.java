package co.uniquindio.sinfoci.Controllers;

import co.uniquindio.sinfoci.Entities.Client;
import co.uniquindio.sinfoci.Entities.ClientOrder;
import co.uniquindio.sinfoci.ServiceImpl.ClientOrderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/client_order.html")
public class ClientOrderController {

    @Autowired
    private ClientOrderImpl col;

    @GetMapping("")
    public ModelAndView listarClientes(@PageableDefault(sort = "name", size = 5) Pageable pageable){
        List<ClientOrder> orders = col.listAllOrders();
        return new ModelAndView("client_order").addObject("orders", orders);
    }
}
