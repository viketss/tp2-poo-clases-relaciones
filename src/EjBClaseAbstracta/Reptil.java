package EjBClaseAbstracta;

public class Reptil extends Animal {
    public Reptil(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Psss");
    }

    @Override
    public void moverse() {
        System.out.println("Arrastrarse...");
    }


}
