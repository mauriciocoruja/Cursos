package Aula_2;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoCoruja = new Conta();

        contaDoCoruja.saldo = 100;
        contaDoCoruja.deposita(50);

        System.out.println("Saldo da conta R$"+contaDoCoruja.saldo);

        contaDoCoruja.saca(100);
        System.out.println(contaDoCoruja.saldo);
    }
}
