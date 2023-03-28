package ProjetoBackEnd.ProjetoAvaliacao.Pessoa;


import ProjetoBackEnd.ProjetoAvaliacao.Endereco.DadosEndereco;

public record DadosPessoaFisica(String nome, String email, String datadenascimento, String senha,
                                String confirmarsenha, String cpf, DadosEndereco endereco) {
}
