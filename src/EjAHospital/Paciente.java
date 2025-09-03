package EjAHospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nombre;
    //private ListaExpedientes expedientes;
    private List<ListaMedicos> medicos; // un paciente, muchos medicos
    private List<ListaExpedientes> expedientes; // un paciente, muchos expedientes

    public Paciente(String nombre, ListaExpedientes expedientes) {
        this.nombre = nombre;
        this.medicos = new ArrayList<>();
        this.expedientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
}
