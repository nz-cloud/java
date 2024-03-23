public class Aumento {
    public static void main(String[] args) {
        double salario = 1000;
        double porcAumento = 1.5;
        double aumento;

        for (int ano = 2006; ano <= 2024; ano = ano + 1 ){
            aumento = salario * (porcAumento / 100);
            salario += aumento;
            System.out.println("Ano: " + ano + " Porcentagem de aumento: " + porcAumento + " Aumento: " + aumento + " salario: "  +  salario);
            porcAumento *= 2;
        }
    }
}
