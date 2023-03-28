package ProjetoBackEnd.ProjetoAvaliacao.Controller;


import ProjetoBackEnd.ProjetoAvaliacao.Pessoa.DadosPessoaFisica;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoafisica")
public class PessoaFisicaController {

    @PostMapping
    public void cadastrar(@RequestBody DadosPessoaFisica dados) {
        System.out.println(dados);
    }


}
