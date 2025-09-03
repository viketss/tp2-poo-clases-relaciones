package EjAHospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String nombre;
    private Departamento departamento;
    // composicion: el inventario se crea en el hospital
    private InventarioEquipos inventario;
    private List<Departamento> departamentos; // relacion uno a muchos


    public Hospital(String nombre,Departamento cardio, InventarioEquipos inventario) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>(); // relacion uno a muchos en constructor
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public InventarioEquipos getInventario() {
        return inventario;
    }
}

