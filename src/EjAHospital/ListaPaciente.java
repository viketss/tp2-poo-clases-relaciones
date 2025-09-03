package EjAHospital;

public class ListaPaciente {
    private Paciente paciente1;
    private Paciente paciente2;

    public ListaPaciente(Paciente paciente1, Paciente paciente2) {
        this.paciente1 = paciente1;
        this.paciente2 = paciente2;
    }

    public Paciente getPaciente1() {
        return paciente1;
    }

    public Paciente getPaciente2() {
        return paciente2;
    }
}
