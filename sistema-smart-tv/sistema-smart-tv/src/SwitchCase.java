public class SwitchCase {

    public static void main(String[] args) {
        
        String sigla = "MM";

        switch (sigla) {
            case "M":
                    System.out.println("Medio");
                    break;
            case "P":
                    System.out.println("Pequeno");
                    break;
            case "G":
                    System.out.println("Grande");
                    break;
        
            default: System.out.println("Valor invalido");
                     break;
        }
    }

}
