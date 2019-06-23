package Aula_2;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;


        System.out.println("Na segunda conta tem R$"+segundaConta.saldo);
        System.out.println("Na primeira conta tem R$"+primeiraConta.saldo);

        System.out.println("\n---------\n");

        /*Exemplo para mostrar o valor default de uma variavel quando instanciada*/
        System.out.println("Numero da agência: "+primeiraConta.agencia);
        System.out.println("Numero da conta: "+primeiraConta.numero);

        System.out.println("\n---------\n");

        /*Complemento para entender a diferença entre referencia e objeto*/
        primeiraConta.saldo = 300;
        primeiraConta.agencia = 148;
        segundaConta.saldo = 300;
        segundaConta.agencia = 148;

        System.out.println("Saldo da primeira conta: R$"+primeiraConta.saldo);
        System.out.println("Numero da agencia da primeira conta: "+primeiraConta.agencia);
        System.out.println("Saldo da segunda conta: R$"+segundaConta.saldo);
        System.out.println("Numero da agencia da segunda conta: "+segundaConta.agencia);

        if (primeiraConta == segundaConta) {
            System.out.println("Trata-se da mesma conta");
        }else {
            System.out.println("São contas diferentes, confira os objetos abaixo:");
            System.out.println("Objeto - primeiraConta : "+primeiraConta);
            System.out.println("Objeto - segundaConta : "+segundaConta);
        }


    }
}
