# alura-java8

Esse projeto tem o objetivo de colocar em prática tudo que for aprendido no curso da alura [Java 8: conheça as novidades dessa versão](https://www.alura.com.br/curso-online-java8-lambdas)

> Status: Concluído

### Aula 01 - Default Methods
* É possível criar métodos com corpo em interfaces, são chamados de `default mathods`;
* Alguns métodos default de interfaces são sort(Comparator ...), forEach(Consumer ...);
* Uma grande vantagem dos `default methods` é que agora uma interface pode evoluir sem quebrar compatibilidade.

[Documentação List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)

### Aula 02 - Lambdas
* Mostrando o uso do lambda;
* O lambda funciona sempre que em uma interface você tem apenas **um** método abstrato. Essa interface chama-se ``interface funcional``.

### Aula 03 - Method references
* O que faz um lambda? A grosso modo, é: dado um parâmetro, retorna um valor;
* String::lenght significa: Dado uma string (não importa o nome da variável) retorna o método lenght() dela;
* method references não são reflections, são formas mais simples de passar um lambda.

### Aula 04 - Streams
* Conhecendo a interface Stream (fluxo de alguma coisa);
* Usando filtros em uma Stream;
* Mapeando os objetos por algum atributo (nome, quantidadeAlunos, etc.);
* Utilizando o mapToInt para ter acesso a algumas funções mais específicas de um mapeamento usando números inteiros, como pro exempo o `sum`.

[Documentação Stream](http://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)

### Aula 05 - Mais Streams, Collectors e APIs
* Conhecendo a interface Optional. Ela nos ajuda a trabalhar com referências que são nulas (null);
* Vantagem do uso de Optional: oferece uma variedade imensa de novos métodos que nos permite trabalhar de forma funcional com nossos valores, tirando maior proveito dos novos recursos de `default methods`, `lambda`s e ´method reference´.

[Documentação Optional](http://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)

### Aula 06 - API de datas
* Conhecendo o LocalDate, LocalDateTime, LocalTime e Period;
* Tratando o formato de exibição das datas com DateTimeFormatter;