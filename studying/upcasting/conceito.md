## Compreender Classes e Objetos
Vamos começar do zero.
- Classes: Em Java, uma classe é um modelo que define o comportamento (métodos) e as propriedades (atributos) de objetos.
- Objetos: Um objeto é uma instância de uma classe.

### Exemplo Inicial:
Classe Animal:

```java
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
```
Essa classe Animal tem um método makeSound() que imprime um som genérico.

Subclasse Dog:

```java
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
```
Aqui, a classe Dog estende (herda) Animal e sobrescreve o método makeSound() para imprimir "Dog barks".

---

## Criando e Usando Objetos

Criando um Objeto Dog e Usando-o:

```java
class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Isso vai imprimir "Dog barks"
    }
}
```
Neste exemplo simples, criamos um objeto Dog e chamamos o método makeSound(), que imprime "Dog barks".
---

## Introduzindo o Upcasting
Agora, vamos introduzir o upcasting.

<b>O que é Upcasting?</b>
>Quando fazemos upcasting, estamos dizendo ao compilador para tratar um objeto de uma subclasse (por exemplo, Dog) como se fosse de uma superclasse (por exemplo, Animal). Isso é útil quando queremos usar métodos que funcionam com tipos mais gerais.

Exemplo de Upcasting:

Vamos modificar o exemplo anterior:

```java
class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Criando um objeto Dog
        
        Animal myAnimal = myDog; // Upcasting: Dog é tratado como Animal
        
        myAnimal.makeSound(); // Isso ainda vai imprimir "Dog barks"
    }
}
```

O que acontece aqui:

1. Criação do Objeto Dog: Primeiro, criamos um objeto Dog como antes (Dog myDog = new Dog();).
2. Upcasting: A linha Animal myAnimal = myDog; é onde acontece o upcasting. Aqui, estamos dizendo ao Java para tratar myDog como um Animal.
3. Chamando o Método: Quando chamamos myAnimal.makeSound();, o Java ainda chama o método makeSound() da classe Dog, porque o objeto real ainda é um Dog.

### Por que isso é Importante?

Imagine que você tem um método que trabalha com qualquer tipo de Animal, e você quer usar isso com diferentes tipos de animais (Dog, Cat, etc.). Com upcasting, você pode fazer isso sem precisar se preocupar com o tipo específico de animal. Você pode tratar todos como Animal, mas ainda obter o comportamento específico.

### Simplificando com um Exemplo de Método:
```java
class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        makeAnimalSound(myDog); // Passamos Dog, mas tratamos como Animal
    }

    public static void makeAnimalSound(Animal animal) {
        animal.makeSound(); // Isso chama o método correto dependendo do tipo real
    }
}
```

Neste exemplo, makeAnimalSound pode aceitar qualquer Animal, mas ainda assim chamará o método correto dependendo do tipo real do objeto (Dog, Cat, etc.).

---

## Conclusão

O upcasting permite que você trabalhe com tipos mais gerais (Animal), mas ainda mantenha o comportamento específico do objeto real (Dog). Isso é especialmente útil quando você quer escrever código que funcione com vários tipos de objetos relacionados sem precisar repetir código para cada tipo específico.
