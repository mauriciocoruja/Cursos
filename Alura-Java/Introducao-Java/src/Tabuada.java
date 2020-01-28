public class Tabuada {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            System.out.println("+++++++++++++++++");
            System.out.println("Tabuada do " + i);
            System.out.println("+++++++++++++++++");
            for (int y = 1; y <= 10; y++)
            System.out.println(i + " x " + y + " = " + i * y);
        }
    }
}
