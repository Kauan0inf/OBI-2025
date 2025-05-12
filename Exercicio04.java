import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String semVogais = frase.replaceAll("(?i)[aeiou]", "*");

        System.out.println("Frase sem vogais: " + semVogais);

        scanner.close();
    }
}
