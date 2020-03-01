package OwlBankEncapusulo;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente cliente;
    private static int total;

    public Conta(){
        Conta.total++;
    }

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("A conta " + numero + " foi criada");
    }

    public void deposita(double valor){
        this.saldo += valor;
    }
    public boolean saca(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
            return false;
    }

    public boolean transfere(double valor, Conta destino){
        if (saca(valor)){
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int Numero) {
        this.numero = Numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static int getTotal(){
        return Conta.total;
    }

}
