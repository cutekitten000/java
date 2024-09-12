## O que é uma interface?

Uma **interface** em Java é como um contrato. Ela define um conjunto de métodos que uma classe deve implementar, mas **não fornece a implementação desses métodos**. As interfaces são usadas para garantir que diferentes classes sigam o mesmo conjunto de regras.

## Características das interfaces:

1. **Definição de métodos sem implementação:** Todos os métodos em uma interface são abstratos (sem corpo), exceto os métodos `default` e `static`.
2. **Não podem ter variáveis de instância:** Apenas podem ter constantes (`public static final`).
3. **Multiplicidade:** Uma classe pode implementar várias interfaces, o que permite simular a herança múltipla.
4. Todos os métodos são públicos por padrão.
5. Não podem conter construtores, pois não podem ser instanciadas.

---

### Sintaxe básica de uma interface

```java
public interface NomeDaInterface {
    // Métodos abstratos
    void metodo1();
    void metodo2();
    
    // Métodos default (opcionais)
    default void metodoDefault() {
        System.out.println("Este é um método default.");
    }

    // Métodos estáticos
    static void metodoEstatico() {
        System.out.println("Este é um método estático.");
    }
}
```

### Implementando uma Interface

Quando uma classe implementa uma interface, ela **deve** fornecer implementação para todos os métodos da interface. Isso se faz com a palavra-chave `implements`.

```java
public class MinhaClasse implements NomeDaInterface {
    @Override
    public void metodo1() {
        System.out.println("Implementando o metodo1");
    }

    @Override
    public void metodo2() {
        System.out.println("Implementando o metodo2");
    }
}

```

### Exemplo prático

Imaginemos que você tenha uma interface `Animal` que define alguns comportamentos básicos de animais, como comer e dormir. Cada tipo de animal pode ter uma implementação diferente desses comportamentos.

```java
// Interface
public interface Animal {
    void comer();
    void dormir();
}

// Classe Cachorro implementando a interface Animal
public class Cachorro implements Animal {
    @Override
    public void comer() {
        System.out.println("O cachorro está comendo ração.");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo na casinha.");
    }
}

// Classe Gato implementando a interface Animal
public class Gato implements Animal {
    @Override
    public void comer() {
        System.out.println("O gato está comendo peixe.");
    }

    @Override
    public void dormir() {
        System.out.println("O gato está dormindo no sofá.");
    }
}
```

### Herança Múltipla com Interfaces

Uma classe em Java pode implementar várias interfaces. Isso é útil quando você quer que uma classe tenha comportamentos de diferentes "categorias".

```java
public interface Voar {
    void voar();
}

public interface Nadar {
    void nadar();
}

public class Pato implements Voar, Nadar {
    @Override
    public void voar() {
        System.out.println("O pato está voando.");
    }

    @Override
    public void nadar() {
        System.out.println("O pato está nadando.");
    }
}
```

### Métodos Default e Static

A partir do Java 8, as interfaces podem conter **métodos com implementação** usando as palavras-chave `default` e `static`. O método `default` é útil quando você deseja fornecer uma implementação padrão, mas ainda permite que as classes que implementam a interface o sobreponham, se necessário.

```java
public interface OperacoesMatematicas {
    void somar(int a, int b);

    default void subtrair(int a, int b) {
        System.out.println("Resultado da subtração: " + (a - b));
    }

    static void multiplicar(int a, int b) {
        System.out.println("Resultado da multiplicação: " + (a * b));
    }
}

public class Calculadora implements OperacoesMatematicas {
    @Override
    public void somar(int a, int b) {
        System.out.println("Resultado da soma: " + (a + b));
    }
}
```

Aqui, `Calculadora` precisa implementar o método `somar`, mas pode optar por não sobrescrever o método `subtrair`, já que este tem uma implementação `default`. Além disso, a interface fornece um método estático `multiplicar` que pode ser chamado diretamente pela interface.

### Vantagens de usar Interfaces:

- **Organização de código:** Força as classes a terem uma estrutura comum.
- **Flexibilidade:** Permite que uma classe implemente múltiplas interfaces, facilitando a reutilização de código e a modularização.
- **Polimorfismo:** Permite tratar objetos de diferentes classes de forma uniforme (usando a interface como tipo).

## Polimorfismo com Interfaces

As interfaces também permitem o uso do polimorfismo. Você pode tratar objetos que implementam uma interface como instâncias da interface.

```java
public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.comer();  // Saída: O cachorro está comendo ração.

        meuAnimal = new Gato();
        meuAnimal.comer();  // Saída: O gato está comendo peixe.
    }
}
```

## Diferença entre interfaces e Classe abstrata

- **Herança múltipla:** Uma classe pode implementar várias interfaces, mas pode herdar de apenas uma classe abstrata.
- **Construtores:** As interfaces não podem ter construtores; classes abstratas podem.
- **Métodos concretos:** Interfaces podem ter métodos concretos apenas a partir do Java 8 (via `default` e `static`), enquanto classes abstratas sempre puderam ter métodos com implementação.

## Quando usar interfaces?

- Quando você precisa garantir que várias classes diferentes implementem certos métodos.
- Quando quer permitir a implementação de múltiplos comportamentos em uma única classe (herança múltipla).
- Quando deseja aplicar polimorfismo.
