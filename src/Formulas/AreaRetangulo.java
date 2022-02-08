package Formulas;

import java.util.Scanner;

public class AreaRetangulo {
    static float A;
    static float b;
    static float h;

    public static void areaRetangulo(){
        System.out.println("----------------------------\n");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a base(Lado Maior)(cm)");
        b = entrada.nextFloat();

        System.out.println("\nDigite a altura(Lado Menor)(cm)");
        h = entrada.nextFloat();

        A = b * h ;

        System.out.println("\nRESULTADO-----------\n");
        System.out.println("\nÁrea do retângulo: " + A + "cm²\n");

    }

    public AreaRetangulo() {
    }

    public static float getA() {
        return A;
    }

    public static void setA(float a) {
        A = a;
    }

    public static float getB() {
        return b;
    }

    public static void setB(float b) {
        AreaRetangulo.b = b;
    }

    public static float getH() {
        return h;
    }

    public static void setH(float h) {
        AreaRetangulo.h = h;
    }
}
