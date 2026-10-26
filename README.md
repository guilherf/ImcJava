# Calculadora de IMC em Java

Programa de console que calcula o **Índice de Massa Corporal (IMC)** a partir do peso e da altura informados e mostra a classificação correspondente.

## Para que serve

Mostra de forma rápida em qual faixa de peso a pessoa se encontra. Também serve como exercício de leitura de dados do teclado, validação de entrada e estruturas condicionais em Java.

## Como funciona

1. Pede a **altura** (em metros, por exemplo `1.75`) e a **peso** (em kg).
2. Repete a pergunta caso o valor digitado não seja um número válido.
3. Calcula `IMC = peso / (altura × altura)`.
4. Exibe a classificação:

| IMC | Classificação |
|---|---|
| menor que 18,5 | Abaixo do peso |
| 18,5 a 24,9 | Saudável |
| 25 a 29,9 | Sobre o peso |
| 30 a 34,9 | Obesidade Grau I |
| 35 a 39,9 | Obesidade Grau II |
| 40 ou mais | Obesidade Grau III |

> O IMC é apenas um indicador de referência e não substitui a avaliação de um profissional de saúde.

## Tecnologias

- Java 21
- Maven (sem dependências externas)

## Como executar

Pré-requisito: **JDK 21**. Como não há dependências externas, basta o `javac`:

```bash
git clone https://github.com/guilherf/ImcJava.git
cd ImcJava
javac -d out src/main/java/net/bifewagyu/Main.java
java -cp out net.bifewagyu.Main
```

Ou abra no IntelliJ IDEA (projeto Maven) e execute `src/main/java/net/bifewagyu/Main.java`.

## Autor

Guilherme Ferreira — [@guilherf](https://github.com/guilherf)
