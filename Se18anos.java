import javax.swing.JOptionPane;

public class Se18anos {
    public static void main (String[] args) {

        Integer anos;

        anos = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem? "));

        if (anos >= 18) {
            JOptionPane.showMessageDialog(null, "Você tem " + anos + " anos e tem idade para dirigir um carro");
        } else {
            JOptionPane.showMessageDialog(null, "Você tem " + anos + " anos e não tem idade para dirigir um carro");
        }
    }
}
