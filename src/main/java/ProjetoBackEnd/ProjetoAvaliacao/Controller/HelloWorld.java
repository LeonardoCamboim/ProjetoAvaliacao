package ProjetoBackEnd.ProjetoAvaliacao.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {



    public String helloWorld() {
        return "Hello World!";
    }
}
