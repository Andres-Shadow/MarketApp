package co.uniquindio.sinfoci.TestControllers;

import co.uniquindio.sinfoci.ServiceImpl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private ClientServiceImpl csl;

    @GetMapping(value = "/users")
    public String saludar(){
        String nombre = csl.getClient(1).getName();
        return  nombre;
    }
}
