import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ler a cotação do Dólar
        System.out.println("Qual é a cotação do Dólar?");
        double cotacao = sc.nextDouble();

        //ler a quantidade de Dólares 
        System.out.println("Qual a quantidade de Dólares");
        double quantidade = sc.nextDouble();

        //Converter Dólar para Real
        double reais = quantidade * cotacao;
        
        //mostrar o resultado
        System.out.printf("Você tem o equivalente a R$ %.2f\n:", reais);
        sc.close();

    }
}

