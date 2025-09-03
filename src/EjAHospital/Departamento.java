package EjAHospital;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    //private ListaMedicos medicos;
    private Equipo equipo;
    private List<ListaMedicos> medicos; // un departamento, muchas listas de medicos
    // agregacion: el inventario existe independientemente del departamento
    private InventarioEquipos inventario;

    public Departamento(String nombre, ListaMedicos medicos, Equipo equipo) {
        this.nombre = nombre;
        this.medicos = new ArrayList<>();
        this.equipo = equipo;
        this.inventario = inventario; // el objeto Inventario se pasa de afuera
    }

    public String getNombre() {
        return nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }
}



