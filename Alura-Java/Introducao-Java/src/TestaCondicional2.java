public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 17;
        int quantidadedePessoas = 2;

        boolean acompanhado = quantidadedePessoas >= 2;

        String resposta;

        if (acompanhado){
            resposta = "Sim";
        } else {
            resposta = "Não";
        }

        System.out.println("Tem acompanhante: " + resposta);

        if (idade >= 18 || acompanhado) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente você não é bem vindo");
        }
    }
}