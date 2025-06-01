package br.com.izaacpinheiro.javastudies.Generics;

import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando doguinho");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando gatinho");
    }
}

public class Wildcard {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
    }
    // pode receber Animal ou qualquer filho de Animal
    private static void printConsulta(List<? extends Animal> animais){
        for (Animal animal : animais) {
            animal.consulta();
        }
    }
    // pode receber animal e qualquer um que seja pai de Animal
    private static void printConsultaAnimal(List<? super Animal> animais) {
        animais.add(new Cachorro());
        animais.add(new Gato());
    }
}
