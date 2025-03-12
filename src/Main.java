import default_method.Carro;
import default_method.DefaultMethodFacade;
import streams_api.StreamsApiFacade;
import streams_api.UserService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        // Exemplo de streams api
//        StreamsApiFacade streamsApiFacade = new StreamsApiFacade();
//        streamsApiFacade.printExemplos();


        // Exemplo de default method
        DefaultMethodFacade defaultMethodFacade = new DefaultMethodFacade();
        defaultMethodFacade.printExemplos();
    }
}