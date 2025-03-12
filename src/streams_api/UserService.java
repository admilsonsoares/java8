package streams_api;

import java.util.*;
import java.util.stream.Collectors;

public class UserService {

    private List<User> users = Arrays.asList(
            new User("Alice", 25, "São Paulo"),
            new User("Bob", 17, "Rio de Janeiro"),
            new User("Charlie", 30, "Belo Horizonte"),
            new User("David", 40, "São Paulo"),
            new User("Eve", 22, "Rio de Janeiro"),
            new User("Frank", 35, "Belo Horizonte")
    );

    // Filtrar usuários com mais de 18 anos
    public List<User> getAdultUsers() {
        return users.stream()
                .filter(user -> user.getAge() >= 18)
                .collect(Collectors.toList());
    }

    // Mapear os nomes dos usuários
    public List<String> getUserNames() {
        return users.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }

    // Ordenar os usuários por idade
    public List<User> getUsersSortedByAge() {
        return users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
    }

    // Contar quantos usuários são de uma determinada cidade
    public long countUsersByCity(String city) {
        return users.stream()
                .filter(user -> user.getCity().equalsIgnoreCase(city))
                .count();
    }

    // Agrupar usuários por cidade
    public Map<String, List<User>> groupUsersByCity() {
       return users.stream()
               .collect(Collectors.groupingBy(User::getCity));
    }

    // Calcular a média de idade dos usuários
    public double getAverageAge() {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0.0);
    }
    // Encontrar o usuário mais velho
    public Optional<User> getOldestUser() {
        return users.stream()
                .max(Comparator.comparingInt(User::getAge));
    }

    // Somar todas as idades usando reduce
    public int sumAllAges() {
       return users.stream()
               .map(User::getAge)
               .reduce(0, Integer::sum);
    }
}
