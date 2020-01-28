public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 10;
        int quantidadedePessoas = 3;

        if (idade >= 18) {
            System.out.println("Okay, você é maior de idade");
            System.out.println("Seja bem vindo");
        } else {
            if (quantidadedePessoas >= 2) {
                System.out.println("Já que está acompanhado você pode entrar :)");
            } else {
                System.out.println("Infelizmente você não é bem vindo");
            }
        }
    }
}
