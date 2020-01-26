public class TiposVariaveis {
    public static void main(String[] args) {
        //Ponto flutuante

        //int salario = 1250.70; Não se pode atribuir um tipo int para um numero decimal, uma das formas recomendadas é
        //usar o tipo double
        double salario = 1250.70;

        System.out.println("O salário dessa pessoa é R$" + salario);

        //Deve-se ficar atento também para resultados de operações que podem resultar em pontos flutuantes, como no exemplo abaixo:

        int divisaoInt = 5 / 2;
        System.out.println(divisaoInt);

        /*O mais recomendado a se fazer nesse cenário é deixar um dos fatores da divisão com um a casa decimal e alterar o tipo da variável para double como no exemplo abaixo*/

        double divisaoDouble = 5.0 / 2;
        System.out.println(divisaoDouble);

        /*Testando conversões*/

        double salarioConvertido = 1270.50;
        int valor = (int) salarioConvertido; /*Para que essa declaração funcionasse, foi necessário declarar um cast (int)*/
        System.out.println(valor);
    }
}
