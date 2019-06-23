package Aula_2;

public class TesteReferencia {
    public static void main(String[] args) {

        /*Instanciamento da conta*/
        Conta primeiraConta = new Conta();

        /*Primeira referencia para conta e atribuição de valor*/
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira conta: "+ primeiraConta.saldo);

        /*Segunda referencia para a conta instanciada*/
        Conta segundaConta = primeiraConta;
        System.out.println("O saldo da segunda conta: "+segundaConta.saldo);

        /*Acréscimo de valor para a conta através da segunda referencia, que foi criada
        * Através de uma variável (Conta segundaConta = primeiraConta;)*/
        segundaConta.saldo += 100;
        System.out.println("O saldo da segunda conta: "+segundaConta.saldo);

        /*Imprimindo o valor da conta, através da primeira referencia. Pode-se observar
        * Que o valor é o mesmo, pois 'primeiraConta e segundaConta' são apenas
        * referencias para o objeto conta que foi instanciado apenas uma vez*/
        System.out.println("Saldo da primeira conta: "+ primeiraConta.saldo);

        /*Comparando os valores através de if e certificando a informação acima*/

        System.out.println("\n---------\n");
        if (segundaConta == primeiraConta) System.out.println("Tratam-se da mesma conta");

        /*Imprimindo o valor do objeto através das referencias*/
        System.out.println(primeiraConta);
        System.out.println(segundaConta);


    }

}
