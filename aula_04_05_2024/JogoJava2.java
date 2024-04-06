package aula_04_05_2024;

//public class JogoJava2 {
//    public static void main(String[] args) {
//
//        //construtor
//        Personagem cacador = new Persoangem("Nicolas", 10, 0, 0);
//
//        while (true) {
//            cacador.cacar();
//            cacador.comendo();
//            cacador.dormindo();
//            cacador.cacar();
//            cacador.cacar();
//            cacador.cacar();
//            System.out.println("==============");
//            Thread.sleep(2000);
//        }
//        
//    }
//}

public class JogoJava2 {
    public static void main(String[] args) throws InterruptedException {
        Personagem cacador = new Personagem("John", 10, 0, 0);

        while (true) {
            cacador.cacar();
            cacador.comer();
            cacador.dormir();
            cacador.cacar();
            cacador.cacar();
            cacador.cacar();
            System.out.println("====================");
            Thread.sleep(2000);
        }
    }
}
