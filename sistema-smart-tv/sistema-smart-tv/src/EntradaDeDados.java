import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();
        

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

       


        System.out.println("O seu nome é : " + nome + " " + sobrenome);
        System.out.println("A sua altura é : " + altura + " m.");
        System.out.println("Voce tem " + idade + " anos.");

        scanner.close();
        
    }
    
}
