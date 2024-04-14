import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    

        System.out.println("Digite o seu nome");
        String nome = sc.next();

        System.out.println("Digite o numero da conta: ");
        String conta = sc.next();

        System.out.println("Digite o saldo da conta");
        double saldo =sc.nextDouble();


        System.out.println("----------------------------");
        System.out.println("-------  Dados da conta --------------");
        System.out.println();
        System.out.println("Proprietario da conta: " + nome);
        System.out.println("Número da conta :" + conta);
        System.out.println("Saldo atual : R$ " + saldo);
        System.out.println();
        System.out.println("-------------------------------");

    }

}
