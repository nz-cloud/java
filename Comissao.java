import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço da peça:");
        double precoDaPeca = sc.nextDouble();

        System.out.println("Digite a quantidade vendida");
        double quantidade = sc.nextDouble();

        double total = precoDaPeca * quantidade;

        double valorComissao = total * 0.05;

        System.out.println("O valor da sua comissão é: " + valorComissao);
        sc.close();

    }
}
