//escreva um programna que imprima os numeros de 1 a 20, substituindo os multiplos de 4 ou de 10 por "PIM"

import javax.swing.JOptionPane;

public class Pim {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++ ) {
            if (i % 4 == 0 || i % 10 == 0) {
                System.out.println("PIM");   
            } else {
                System.out.println(i);
            }
        }
    }
}
