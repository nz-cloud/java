// Pergunte um número ao usuário
// Se o número for divisível por 4 ou 10 imprima PIM SIMPES
// Se não imprima o número

// /n = isso faz com que quebre a linha (/n)


import javax.swing.JOptionPane;

public class PimSimples {
    public static void main(String[] args) {
        
        Double numero;

        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

        if (numero % 10 == 0 || numero % 4 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é um PIM SIMPLES");
        } else {
            JOptionPane.showMessageDialog(null, numero);
        }  
    }
}
