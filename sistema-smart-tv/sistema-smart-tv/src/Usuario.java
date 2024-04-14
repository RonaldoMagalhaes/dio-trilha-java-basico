public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " +smartTv.canal);
        System.out.println("Volume Atual: " +smartTv.volume);

        smartTv.ligar();
        System.out.println();
        System.out.println("TV Ligada: " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " +smartTv.volume);

        System.out.println();
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " +smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " +smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " +smartTv.canal);

        System.out.println();

        smartTv.mudarCanal(35);
        System.out.println("Canal Atual: " +smartTv.canal);

        smartTv.mudarCanal(135);
        System.out.println("Canal Atual: " +smartTv.canal);

        smartTv.mudarCanal(3);
        System.out.println("Canal Atual: " +smartTv.canal);
        

    }
}
