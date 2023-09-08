package co.uniquindio.sinfoci.Controllers;

import co.uniquindio.sinfoci.Entities.Client;
import co.uniquindio.sinfoci.ServiceImpl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/client.html")
public class ClientController {

    @Autowired
    private ClientServiceImpl csl;

    @GetMapping("")
    public ModelAndView listarClientes(@PageableDefault(sort = "name", size = 5)Pageable pageable){
        List<Client> clients = csl.listAllClients();
        return new ModelAndView("client").addObject("clients", clients);
    }


}
