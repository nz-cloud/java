import java.util.Scanner;

import javax.swing.JOptionPane;

public class Fatorial {
    public static void main(String[] args) {
        Double n = - 1;
        while (n < 0) {
            n = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de N, sendo ele positivo"));
        }
        double e = 1;
        for (int i = 1; i <= n; i++) {
            int fatorial = 1;
            for (int pedacos_fatorial = i; pedacos_fatorial >= 2; pedacos_fatorial-- ){
                fatorial *= pedacos_fatorial;
            }

            double parcelaSoma = 1 / (double) fatorial;
            e += parcelaSoma;
            System.out.println(fatorial);
        }
        System.out.println(e); 

        


       //if (n < 0) {
       //    JOptionPane.showMessageDialog(null,"Digite um número inteiro");
       //    while (n >= ) {
       //        
       //    }
       // 
       //
       //}
        }    }
