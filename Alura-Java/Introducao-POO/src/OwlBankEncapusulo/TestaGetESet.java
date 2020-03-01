package OwlBankEncapusulo;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        conta.setNumero(8532);
        System.out.println(conta.getNumero());

        conta.setAgencia(1225);
        System.out.println(conta.getAgencia());

        /*------------------------*/

        conta.setCliente(cliente);
        cliente.setNome("Mauricio Barbosa");
        cliente.setCpf("XXX.487.656-58");
        cliente.setProfissao("QA Analist");

        System.out.println(conta.getCliente().getNome());
        System.out.println(conta.getCliente().getCpf());
        System.out.println(conta.getCliente().getProfissao());
        System.out.println(conta.getAgencia());

        Conta conta1 = new Conta(5389,37682);

        System.out.println(Conta.getTotal());

    }
}
