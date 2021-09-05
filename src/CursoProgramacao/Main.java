package CursoProgramacao;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int y = 32;

        double x = 2.003156;

        System.out.println("Olá Mundo");
        System.out.println("Bom dia");
        System.out.println(x);
        System.out.println(y);
        System.out.printf("%.2f%n", x);
        System.out.println("RESULTADO = " + x + "METROS");

        Locale.setDefault(Locale.US);

    }
}
