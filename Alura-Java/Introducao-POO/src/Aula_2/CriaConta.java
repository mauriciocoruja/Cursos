package Aula_2;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeirConta = new Conta();

        primeirConta.saldo = 200;
        System.out.println(primeirConta.saldo);

        primeirConta.saldo += 100;
        System.out.println(primeirConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;


        System.out.println("Na segunda conta tem R$"+segundaConta.saldo);
        System.out.println("Na primeira conta tem R$"+primeirConta.saldo);

        System.out.println("\n---------\n");

        /*Exemplo para mostrar o valor default de uma variavel quando instanciada*/
        System.out.println("Numero da agência: "+primeirConta.agencia);
        System.out.println("Numero da conta: "+primeirConta.numero);
    }
}
