## Essa repositorio apresenta de forma simplificada o uso de algumas features do java 8 

## Streams API

 ✔ filter(user -> user.getAge() >= 18) → Filtra usuários com mais de 18 anos.

 ✔ map(streams_api.User::getName) → Retorna apenas os nomes dos usuários.

 ✔ sorted(Comparator.comparingInt(streams_api.User::getAge)) → Ordena os usuários por idade.

 ✔ count() → Conta quantos usuários são de uma cidade específica.

 ✔ collect(Collectors.groupingBy(streams_api.User::getCity)) → Agrupa os usuários por cidade.

 ✔ mapToInt(streams_api.User::getAge).average() → Calcula a média de idade.

 ✔ max(Comparator.comparingInt(streams_api.User::getAge)) → Obtém o usuário mais velho.

 ✔ reduce(0, Integer::sum) → Soma todas as idades.
 
## Default method

## Lambdas

## Optional

 ✔ Optional.of("Alice") → Cria um Optional com um valor presente.

 ✔ Optional.empty() → Cria um Optional vazio.

 ✔ isPresent() → Verifica se o Optional tem um valor.
 
 ✔ orElse("Nome não encontrado") → Retorna o valor se existir, senão retorna um padrão.

 ✔ ifPresent(n -> System.out.println(n)) → Executa uma ação se o valor estiver presente.