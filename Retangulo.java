import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do Retâgulo: ");
        double base = sc.nextDouble();

        System.out.println("Digite a altura do Retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.println("O valor da Base x Altura do seu Retângulo é: " + area);
        sc.close();
        
    }
}
