import java.util.Random;

public class Atacable implements IAtacable {

    private String nombre;
    private int vida;

    public Atacable(int vida, String nombre) {
        this.vida = vida;
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void recibirDanio() {
        Random rand = new Random();
        int danio = rand.nextInt(10,30); // daño aleatorio
        // Actualizamos la vida
        vida -= danio;
        System.out.println(nombre + " recibe " + danio + " de daño. Vida restante: " + vida);
    }

    public boolean estaMuerto() {
        return vida <= 0;
    }

}
