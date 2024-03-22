import javax.swing.JOptionPane;

public class ImparOuPar {
    public static void main (String[] args) {

        double n1;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));

        if (n1 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + n1 + " é par");
        } else {
           JOptionPane.showMessageDialog(null, "O número" + n1 + " é par" ); 
        }
    }
}
