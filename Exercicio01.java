import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String semEspacos = frase.replace(" ", "");

        int quantidadeCaracteres = semEspacos.length();

        System.out.println("A frase contém " + quantidadeCaracteres  );

        scanner.close();
    }
}
