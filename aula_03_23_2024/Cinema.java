// Você foi contratado por um cinema par arealizar um programa que calcula o valor do ingresso, a partir da idade:
// se menor de 2 anos, gra

import javax.swing.JOptionPane;

public class Cinema {
    public static void main(String[] args) {
        
        Double valor_ingresso, idade;

        valor_ingresso = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ingresso "));
        idade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua idade" ));

        if (idade < 2) {
            JOptionPane.showMessageDialog(null, "O valor do ingresso é grátis ");
        } else if (idade <= 18 ) {
            JOptionPane.showMessageDialog(null, "O valor do ingresso que é " + valor_ingresso + " passa a custar " + valor_ingresso /2 + " reais");
        } else if (idade <= 64 ) {
            JOptionPane.showMessageDialog(null, " O valor do ingresso é " + valor_ingresso);
        } else {
            JOptionPane.showMessageDialog(null, " O valor do ingresso que é " + valor_ingresso + " passa a custar " + valor_ingresso / 2);
        }
    }
}
