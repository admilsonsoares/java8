package lambdas;

public class LambdaFacade {
    Saudacao saudacao = nome -> System.out.println("Olá, " + nome + "!" );

    public LambdaFacade() {}

    public void printExemplos(){
        saudacao.mensagem("Brasileiro");
    }
}
