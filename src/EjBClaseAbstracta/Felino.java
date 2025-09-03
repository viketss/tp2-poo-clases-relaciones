package EjBClaseAbstracta;

public class Felino extends Animal {
    // constructor: hereda atributos de superclase Animal
    public Felino(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }

    // metodo abstracto de la superclase
    @Override
    public void hacerSonido() {
        System.out.println("Grrrr");
    }

    @Override
    public void moverse() {
        System.out.println("Trepar...");
    }

}
