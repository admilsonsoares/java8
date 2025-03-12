

## Explicação do uso de streams api

## ✔ filter(user -> user.getAge() >= 18) → Filtra usuários com mais de 18 anos.
## ✔ map(User::getName) → Retorna apenas os nomes dos usuários.
## ✔ sorted(Comparator.comparingInt(User::getAge)) → Ordena os usuários por idade.
## ✔ count() → Conta quantos usuários são de uma cidade específica.
## ✔ collect(Collectors.groupingBy(User::getCity)) → Agrupa os usuários por cidade.
## ✔ mapToInt(User::getAge).average() → Calcula a média de idade.
## ✔ max(Comparator.comparingInt(User::getAge)) → Obtém o usuário mais velho.
## ✔ reduce(0, Integer::sum) → Soma todas as idades.