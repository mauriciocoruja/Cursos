package Aula_2;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoCoruja = new Conta();
        contaDoCoruja.titular = "Coruja";

        contaDoCoruja.saldo = 100;
        contaDoCoruja.deposita(50);

        System.out.println("Saldo da conta R$"+contaDoCoruja.saldo);

        contaDoCoruja.saca(100);
        System.out.println(contaDoCoruja.saldo);

        Conta contaDoMauricio = new Conta();
        contaDoMauricio.titular  = "Mauricio";
        contaDoMauricio.deposita(1000);

        boolean valorTransferencia = contaDoMauricio.transfere(1000, contaDoCoruja);
        if (valorTransferencia) {
            System.out.println(contaDoCoruja.titular+" recebeu dinheiro de "+contaDoMauricio.titular);
        }else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println(contaDoCoruja.titular + " | saldo de R$" + contaDoCoruja.saldo);
        System.out.println(contaDoMauricio.titular + " | saldo R$" + contaDoMauricio.saldo);
    }
}
