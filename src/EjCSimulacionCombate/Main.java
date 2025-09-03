
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Atacable h = new Heroe(60, "Martin");
        Atacable m = new Monstruo(60, "Tomas");
        Atacable n = new Villana(60, "Victoria");
        int personajesVivos = 3;
        System.out.println("Comienza el combate");

        while (personajesVivos >= 2){
            // Heroe
            if (!h.estaMuerto()) {
                h.recibirDanio();
                if (h.estaMuerto()) {
                    System.out.println(h.getNombre() + " ha muerto.");
                    personajesVivos--;
                }
            }
            // Villana
            if (!m.estaMuerto()) {
                m.recibirDanio();
                if (m.estaMuerto()) {
                    System.out.println(m.getNombre() + " ha muerto.");
                    personajesVivos--;
                }
            }
            // Monstruo
            if (!n.estaMuerto()) {
                n.recibirDanio();
                if (n.estaMuerto()) {
                    System.out.println(n.getNombre() + " ha muerto.");
                    personajesVivos--;
                }
            }
        }
    }
}
