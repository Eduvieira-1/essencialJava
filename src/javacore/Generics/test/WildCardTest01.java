package javacore.Generics.test;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{

    @Override
    public void consulta(){
        System.out.println("Consultando doguinho");
    }
}

class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
    Cachorro[] dog = {new Cachorro(), new Cachorro()};
    Gato[] cat = {new Gato(), new Gato()};
    printConsulta(dog);
    printConsulta(cat);
    Animal[] animals = {new Gato(), new Gato()};
    printConsulta(animals);
    }

    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
}
