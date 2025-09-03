package EjBClaseAbstracta;

public class Ave extends Animal {
    public Ave(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }

    // metodos abstractos implementados en subclase
    @Override
    public void hacerSonido() {
        System.out.println("Pio pio");
    }

    @Override
    public void moverse() {
        System.out.println("volar...");
    }
}
