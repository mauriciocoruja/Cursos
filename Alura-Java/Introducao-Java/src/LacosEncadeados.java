public class LacosEncadeados {
    public static void main(String[] args) {

        //Tabuada
        /*for (int i = 1; i <= 10; i++) {
            System.out.println("\n----------\n");
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }*/

        //Matriz triangular
        /*for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //Exercitando laços aninhados e break

        /*for(int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (coluna > linha) {
                    break;
                }
                System.out.print(coluna+1);
            }
            System.out.println();
        }*/


        //Multiplos de 3
        /*for (int i = 3; i <=100 ; i+=3) {
            System.out.println(i);
        }

        for (int i = 3; i < 100; i++) {
            if (i % 3 == 0) System.out.println(i);
        }*/

        int fatorial = 1;
        for (int i = 1; i <= 10; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " +fatorial);
        }





    }
}
