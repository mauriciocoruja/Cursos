public class TesteIR {
    public static void main(String[] args) {

        double salario = 3300.0;

        if (salario >= 1900.0 && salario <= 2800.0) {
            salario *= 0.075;
            System.out.println("Valor da alíquota R$" + salario);
            System.out.println("Pode ser deduzido o R$142");
        } else if (salario >= 2800.01 && salario <= 3751.0) {
            salario *= 0.15;
            System.out.println("Valor da alíquota R$" + salario);
            System.out.println("Pode ser deduzido o R$350");
        } else if (salario >= 3751.01 && salario <= 4664.00) {
            salario *= 0.225;
            System.out.println("Valor da alíquota R$" + salario);
            System.out.println("Pode ser deduzido o R$636");
        }

    }
}
