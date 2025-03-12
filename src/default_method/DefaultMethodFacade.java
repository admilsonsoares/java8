package default_method;

public class DefaultMethodFacade {
    private Carro carro;

    public DefaultMethodFacade() {
        this.carro = new Carro();
    }

    public void printExemplos(){
        carro.acelerar();
        carro.buzinar();
    }


}
