import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("Frase em maiúsculas: " + frase.toUpperCase());
        System.out.println("Frase em minúsculas: " + frase.toLowerCase());

        scanner.close();
    }
}
