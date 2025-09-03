package EjAHospital;

public class Medico {
    private String nombre;
    private String especialidad;
    private ListaPaciente pacientes;


    public Medico(String nombre, String especialidad, ListaPaciente pacientes) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.pacientes = pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public ListaPaciente getPacientes() {
        return pacientes;
    }
}
