package EjBClaseAbstracta;

public abstract class Animal {
    // atributos
    private String nombre;
    private int edad;
    private float peso;

    // constructor

    public Animal(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    //metodo concreto
    public void comer() {
        System.out.println(this.nombre + "esta comiendo");
    }

    // metodo abstracto que implementan las subclases
    public abstract void hacerSonido(); // cada animal hace un sonido distinto
    public abstract void moverse();

    // getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public float getPeso() {
        return peso;
    }

}
