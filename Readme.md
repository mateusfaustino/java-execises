Beleza, Aspira! Vou corrigir o formato do Markdown para que fique **100% limpo e pronto para usar**, sem código desnecessário ou formatação bugada. Aqui vai:

---

# 📝 Exercícios Práticos de Java - Sintaxe Básica

Seu objetivo é praticar a sintaxe do Java para ganhar familiaridade com a linguagem. Resolva cada exercício criando um novo arquivo `.java`, compile e execute no terminal.

---

## 📘 1. Olá, Mundo!

Crie um programa Java que imprime na tela:

```
Olá, Mundo! Bem-vindo ao Java.
```

---

## 📘 2. Variáveis e Tipos

Crie um programa que:

* Declara uma variável `String` com seu nome.
* Declara uma variável `int` com sua idade.
* Declara uma variável `double` com sua altura.
* Imprime uma frase como:

```
Meu nome é João, tenho 25 anos e minha altura é 1.75 metros.
```

---

## 📘 3. Soma de Dois Números

    Peça ao usuário dois números inteiros (use `Scanner`) e mostre a soma deles na tela.

**Exemplo de saída:**

```
Digite o primeiro número: 5
Digite o segundo número: 7
A soma é: 12
```

---

## 📘 4. Par ou Ímpar

Leia um número inteiro e informe se ele é **par** ou **ímpar**.

---

## 📘 5. Calculadora Simples

Peça ao usuário dois números e uma operação (`+`, `-`, `*`, `/`). Realize a operação e mostre o resultado.

**Exemplo:**

```
Digite o primeiro número: 10
Digite o segundo número: 2
Digite a operação (+, -, *, /): *
Resultado: 20
```

---

## 📘 6. Contagem de 1 a 10

Use um laço `for` para imprimir os números de 1 a 10.

---

## 📘 7. Tabuada

Peça ao usuário um número e imprima a **tabuada** desse número (de 1 a 10).

**Exemplo:**

```
Digite um número: 5
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
```

---

## 📘 8. Verificador de Números Positivos

Leia um número inteiro e informe:

* "Positivo" se o número for maior que zero.
* "Negativo" se for menor que zero.
* "Zero" se for igual a zero.

---

## 📘 9. Função de Boas-vindas

Crie uma função chamada `boasVindas(String nome)` que recebe o nome de uma pessoa e imprime:

```
Olá, <nome>! Bem-vindo ao programa em Java.
```

No método `main`, peça o nome do usuário e chame essa função.

---

## 📘 10. Array de Notas

Crie um array com 5 notas (valores `double`), calcule a média e informe:

```
A média das notas é: X
```

Perfeito, Aspira! Vou montar **10 exercícios práticos focados em `enum` no Java** para você ficar fera nesse conceito. Eles vão desde criar enums simples até usá-los com métodos, `switch` e integração com classes. E vou formatar bonitinho em **Markdown (.md)** para você copiar e usar direto.

---

# 📝 Exercícios de Java - Praticando Enum

O objetivo destes exercícios é te ajudar a **entender e usar `enum` no Java** com diferentes cenários.

---

## 📘 11. Criando um Enum Simples

Crie um `enum` chamado `DiaDaSemana` que representa os dias da semana (SEGUNDA, TERÇA, ..., DOMINGO). No método `main`, imprima todos os valores do enum.

---

## 📘 12. Mensagem do Dia

Use o `enum DiaDaSemana` do exercício anterior para imprimir uma mensagem diferente para cada dia da semana usando `switch`.

---

## 📘 13. Enum com Construtor

Crie um `enum` chamado `Planeta` com os planetas do sistema solar e associe a cada planeta o valor da gravidade (em m/s²).

* Exemplo: `TERRA(9.8), MARTE(3.7)`
  No método `main`, imprima todos os planetas e suas gravidades.

---

## 📘 14. Usando Enum em Classe

Crie um `enum` chamado `StatusPedido` com valores: `PENDENTE`, `PROCESSANDO`, `ENVIADO`, `ENTREGUE`.
Depois crie uma classe `Pedido` com atributos `id` e `status`. No método `main`, crie um pedido e altere seu status.

---

## 📘 15. Enum com Métodos

Adicione um método ao `enum Planeta` que calcula o peso de um objeto em cada planeta, dado o peso na Terra.
**Fórmula:** pesoPlaneta = pesoTerra \* gravidadePlaneta / gravidadeTerra

---

## 📘 16. Iterando sobre Enums

Crie um `enum` chamado `NivelAcesso` com os valores: `ADMIN`, `MODERADOR`, `USUARIO`, `CONVIDADO`. No método `main`, percorra todos os níveis de acesso usando `for-each`.

---

## 📘 17. Enum com valores personalizados

Crie um `enum` chamado `Moeda` com os valores: `REAL`, `DOLAR`, `EURO`, cada um com seu símbolo associado (`R$`, `$`, `€`).
No método `main`, imprima o nome e o símbolo de cada moeda.

---

## 📘 18. Conversão de String para Enum

Crie um `enum` chamado `Cor` com valores: `VERMELHO`, `AZUL`, `VERDE`.
No método `main`, peça ao usuário para digitar uma cor e converta o texto digitado em um valor do enum usando `valueOf()`.

---

## 📘 19. Enum em Switch Expressions

Use um `switch` moderno (Java 14+) com um `enum` chamado `Dia` para retornar se o dia é útil ou final de semana.

---

## 📘 20. Enum como Singleton

Crie um `enum` chamado `ConfiguracaoSistema` com uma única constante `INSTANCIA`.
Implemente nele um método `imprimirMensagem()` e chame no `main`. Explique porque enums podem ser usados como singleton.

---

✅ **Dica geral:** compile com:

```
javac NomeDoArquivo.java
```

E execute com:

```
java NomeDoArquivo
```

---

Quer que eu também:
✅ Monte **o gabarito com as soluções** dos 10 exercícios?
✅ Gere uma **versão em PDF estilizada** para você estudar?
✅ Ou prefere que eu crie **exercícios com enums + orientação a objetos** para já avançar?

