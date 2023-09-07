package co.uniquindio.sinfoci;

import co.uniquindio.sinfoci.Entities.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class WebApplication {
    public static void main(String[] args) {SpringApplication.run(WebApplication.class, args);}

    @Controller
    public static class WebController {

        @GetMapping("/")
        public String index() {
            return "index";
        }

    }


}
