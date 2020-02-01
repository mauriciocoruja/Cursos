package OwlBank;

public class TestaBanco {

    public static void main(String[] args) {
        Cliente mauricio = new Cliente();

        mauricio.nome = "Mauricio Barbosa";
        mauricio.cpf = "41402605803";
        mauricio.profissao = "QA";

        Conta contaMauricio = new Conta();
        contaMauricio.deposita(100);

        contaMauricio.titular = mauricio;
        System.out.println(contaMauricio.titular.nome);

        Conta nathalia = new Conta();
        nathalia.titular = new Cliente();

        nathalia.titular.nome = "Princesa Leya";
        nathalia.titular.cpf = "448.485.484-98";

        System.out.println(nathalia.titular.nome);
        System.out.println(nathalia.titular.cpf);

    }
}
