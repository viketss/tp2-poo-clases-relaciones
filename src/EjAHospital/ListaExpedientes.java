package EjAHospital;

public class ListaExpedientes {
    private Expediente expediente1;
    private Expediente expediente2;


    public ListaExpedientes(Expediente expediente1, Expediente expediente2) {
        this.expediente1 = expediente1;
        this.expediente2 = expediente2;
    }

    public Expediente getExpediente1() {
        return expediente1;
    }

    public Expediente getExpediente2() {
        return expediente2;
    }
}
