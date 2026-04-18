import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo1 = scanner.nextInt();
        int quantidade1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();

        int codigo2 = scanner.nextInt();
        int quantidade2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();

        double total1 = quantidade1 * valor1;
        double total2 = quantidade2 * valor2;

        double totalGeral = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalGeral);

        scanner.close();


    }
}
