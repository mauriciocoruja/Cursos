public class DesafioFatorial {
    public static void main(String[] args) {

        int inicioFatorial = 1;
        int limiteFatorial = 10;

        for (int i = 1; i <= limiteFatorial; i++){
            inicioFatorial *= i;
            System.out.println("Fatorial de " + i + " = " + inicioFatorial);
        }

        System.out.println("***********************************");

//        int fatorial = 1;
//        for (int i = 1; i < 11; i++) {
//            fatorial *= i;
//            System.out.println("Fatorial de " + i + " = " +fatorial);
//        }

    }
}
