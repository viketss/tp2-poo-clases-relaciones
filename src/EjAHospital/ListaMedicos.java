package EjAHospital;

public class ListaMedicos {
    private Medico medico1;
    private Medico medico2;

    public ListaMedicos(Medico medico1, Medico medico2) {
        this.medico1 = medico1;
        this.medico2 = medico2;
    }

    public Medico getMedico1() {
        return medico1;
    }

    public Medico getMedico2() {
        return medico2;
    }
}
