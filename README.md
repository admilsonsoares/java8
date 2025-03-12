## Essa repositorio apresenta de forma simplificada o uso de algumas features do java 8 

## streams api

 ✔ filter(user -> user.getAge() >= 18) → Filtra usuários com mais de 18 anos.

 ✔ map(streams_api.User::getName) → Retorna apenas os nomes dos usuários.

 ✔ sorted(Comparator.comparingInt(streams_api.User::getAge)) → Ordena os usuários por idade.

 ✔ count() → Conta quantos usuários são de uma cidade específica.

 ✔ collect(Collectors.groupingBy(streams_api.User::getCity)) → Agrupa os usuários por cidade.

 ✔ mapToInt(streams_api.User::getAge).average() → Calcula a média de idade.

 ✔ max(Comparator.comparingInt(streams_api.User::getAge)) → Obtém o usuário mais velho.

 ✔ reduce(0, Integer::sum) → Soma todas as idades.
 
## Default method