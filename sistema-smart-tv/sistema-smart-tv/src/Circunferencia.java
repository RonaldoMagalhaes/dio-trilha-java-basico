import javax.swing.JOptionPane;

public class Circunferencia {

    public static void main(String[] args) {

    double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo: "));
    final double PI  = 3.14;

    double circunferencia = 2 * PI * raio;

    JOptionPane.showMessageDialog(null,"O comprimento da circunferencia vale : " + circunferencia);
        
    }

}
