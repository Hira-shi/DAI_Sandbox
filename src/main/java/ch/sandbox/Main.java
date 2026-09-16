package ch.sandbox;

abstract class Animal {
  public abstract void sound();

  public abstract void greets();
}

class Dog extends Animal {
  public void sound() {
    System.out.println("Dog sound");
  }

  @Override
  public void greets() {
    System.out.println("Dog jump on you");
  }
}

class Cat extends Animal {
  public void sound() {
    System.out.println("Cat sound");
  }

  @Override
  public void greets() {
    System.out.println("Cat doesn't care about you");
  }
}

public class Main {

  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.sound();
    Animal dog = new Dog();
    dog.sound();
    Animal cat = new Cat();
    cat.sound();
  }
}
