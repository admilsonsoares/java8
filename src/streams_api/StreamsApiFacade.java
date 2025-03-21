package streams_api;

public class StreamsApiFacade {

    private UserService userService;

    public StreamsApiFacade() {
        this.userService = new UserService();
    }

    public void printExemplos(){
        System.out.println("Usuários adultos:");
        userService.getAdultUsers().forEach(System.out::println);

        System.out.println("\nNomes dos usuários:");
        System.out.println(userService.getUserNames());

        System.out.println("\nUsuários ordenados por idade:");
        userService.getUsersSortedByAge().forEach(System.out::println);

        System.out.println("\nQuantidade de usuários em São Paulo:");
        System.out.println(userService.countUsersByCity("São Paulo"));

        System.out.println("\nUsuários agrupados por cidade:");
        userService.groupUsersByCity().forEach((city, users) -> {
            System.out.println(city + ": " + users);
        });

        System.out.println("\nMédia de idade dos usuários:");
        System.out.println(userService.getAverageAge());

        System.out.println("\nUsuário mais velho:");
        userService.getOldestUser().ifPresent(System.out::println);

        System.out.println("\nSoma de todas as idades:");
        System.out.println(userService.sumAllAges());
    }
}
