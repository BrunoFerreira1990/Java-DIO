package controlesexcecao;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

        }
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos.");
        }


    }
}
