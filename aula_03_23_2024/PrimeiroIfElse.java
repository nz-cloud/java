import javax.swing.JOptionPane;

public class PrimeiroIfElse {
    public static void main (String[] args) {

        double n1, n2;

        JOptionPane.showMessageDialog(null, "Vou pedir para que você digite dois números, e eu vou te mostrar qual é o maior entre os dois");

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));

        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

        if (n1 >= n2) {
            JOptionPane.showMessageDialog(null, "O número " + n1 + " é o maior");
        }
        
        else {
            JOptionPane.showMessageDialog(null, "O número " + n2 + " é o maior");

        }

    }
    
}
