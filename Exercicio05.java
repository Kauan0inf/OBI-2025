import java.util.Scanner;

public class Exercicio05 {

    public static boolean ehPalindromo(String texto) {
       
        String limpo = texto.replaceAll("\\s+", "").toLowerCase();

        String reverso = new StringBuilder(limpo).reverse().toString();

        return limpo.equals(reverso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();
        
        if (ehPalindromo(entrada)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }

        scanner.close();
    }
}

