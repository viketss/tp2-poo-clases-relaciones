package EjAHospital;

public class HospitalApp {
    public static void main(String[] args) {

        //Creo expedientes
        Expediente e1 = new Expediente("Hipertension arterial");
        Expediente e2 = new Expediente("Chequeo general");
        ListaExpedientes listaE1 = new ListaExpedientes(e1, e2);


        //Creo pacientes
        Paciente p1 = new Paciente("Victoria Cuomo", listaE1);
        Paciente p2 = new Paciente("Tomas Fiory",  listaE1);
        ListaPaciente listaP1 = new ListaPaciente(p1,p2);

        //Creo medicos
        Medico m1 = new Medico("Dr.Martin Bergero", "Cardiologia", listaP1);
        Medico m2 = new Medico("Dr.Baltasar Bergero", "Neurologia",listaP1);
        ListaMedicos listaM = new ListaMedicos(m1,m2);

        //Creo equipos medicos
        Equipo eq1 = new Equipo(1001);
        Equipo eq2 = new Equipo(1002);
        InventarioEquipos inventario = new InventarioEquipos(eq1,eq2);

        //Creo departamentos
        Departamento cardio = new Departamento("Cardiologia",listaM,eq1);
        Departamento neuro = new Departamento("Neurologia",listaM,eq2);

        //Creo el hospital
        Hospital hospital = new Hospital("Hospital Vida Sana", cardio,inventario);

        //Pruebo getters
        System.out.println("Hospital: " + hospital.getNombre());
        System.out.println("Departamento: " + cardio.getNombre());
        System.out.println("Medico: " + m1.getNombre());
        System.out.println("Paciente: " + p1.getNombre());
        System.out.println("Expediente: " + e1.getDescripcion());
    }
}
