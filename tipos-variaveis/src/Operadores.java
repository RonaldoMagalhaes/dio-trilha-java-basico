public class Operadores {

    public static void main(String[] args) {
        
        String nomeCompleto = "LINGUAGEM" + " JAVA" ;
        System.out.println(nomeCompleto);

        int num = 5;
        System.out.println(num);
        num = - num;
        System.out.println(num);

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        int a;
        int b;
        a = 6;
        b = 6;

        String resultado = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        String nomeUm = "Ronaldo";
        String nomeDois = "Ronaldo";

        System.out.println(nomeUm == nomeDois); //true

        String nomeTres = new String("Ronaldo");
        System.out.println(nomeUm == nomeTres); //false

        System.out.println(nomeUm.equals(nomeTres)); // true


    }
}
