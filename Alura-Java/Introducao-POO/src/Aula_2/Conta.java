package Aula_2;

public class Conta {
    public double saldo;
    public int agencia;
    public int numero;
    public String titular;

    public void deposita(double valor){
        this.saldo += valor;
    }
    public boolean saca(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }else {
            System.out.println("Você não tem saldo o suficiente");
            return false;
        }
    }

    public double transfere(double valor, Conta destino){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
        }else {
            System.out.println("Você não tem saldo");
        }
        return valor;
    }
}
