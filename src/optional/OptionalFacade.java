package optional;

import java.util.Optional;

public class OptionalFacade {

    private Pessoa pessoa1;
    private Pessoa pessoa2;

    public OptionalFacade() {
        pessoa1 = new Pessoa();
        pessoa2 = new Pessoa();

        pessoa1.setName("Maria");
        pessoa1.setCpf(Optional.of("123456789"));

        pessoa2.setName("Joao");
        pessoa2.setCpf(Optional.empty());

    }

    public void printExemplos(){

        System.out.println("Verificando se o campo tem valor");
        System.out.println("cpf preenchido: " + pessoa1.getCpf().isPresent());
        System.out.println("cpf vazio: " +  pessoa2.getCpf().isPresent());

        System.out.println("obtendo o valor do optional caso possua, senao mensagem default");
        System.out.println("cpf preenchido: " + pessoa1.getCpf().orElse("Cpf Nao encontrado"));
        System.out.println("cpf vazio: " +  pessoa2.getCpf().orElse("Cpf nao encontrado"));

        System.out.println("Imprimindo o cpf se existir");
        pessoa1.getCpf().ifPresent(System.out::println);



    }
}
