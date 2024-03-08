import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite 4 números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int soma4 = n1 + n2 + n3 + n4;

    
        System.out.println("A soma desses 4 números é: " + soma4);
        sc.close();

    }
}
