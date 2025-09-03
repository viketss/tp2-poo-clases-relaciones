package EjBClaseAbstracta;

public class PrincipalAnimales {
    public static void main(String[] args) {
        Felino tigre = new Felino("Tigre de bengala", 4, 400);
        Ave tucan = new Ave("Tucan", 3, 30);
        Reptil cocodrilo = new Reptil("Cocodrilo", 9, 900);

        tigre.comer();
        tigre.hacerSonido();
        tigre.moverse();
        System.out.println();

        tucan.comer();
        tucan.hacerSonido();
        tucan.moverse();
        System.out.println();

        cocodrilo.comer();
        cocodrilo.hacerSonido();
        cocodrilo.moverse();
        System.out.println();

    }
}
