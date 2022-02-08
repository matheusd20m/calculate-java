package Formulas;
import java.util.Scanner;

public class AreaTrapezio {

    static float A;
    static float B;
    static float b;
    static float h;

    public static void areaTrapezio(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\nDigite a (Base Maior)(cm)");
        B = entrada.nextFloat();

        System.out.println("\nDigite a (Base Menor)(cm)");
        b = entrada.nextFloat();

        System.out.println("\nDigite a Altura)(cm)");
        h = entrada.nextFloat();

        A = (B + b) * h / 2;
        System.out.println("\nRESULTADO---------------\n");
        System.out.println("Área do Trapézio: " + A + "cm²\n\n");
    }

    public AreaTrapezio() {
    }

    public static float getA() {
        return A;
    }

    public static void setA(float a) {
        A = a;
    }

    public static float getB() {
        return B;
    }

    public static void setB(float b) {
        B = b;
    }

    public static float getH() {
        return h;
    }

    public static void setH(float h) {
        AreaTrapezio.h = h;
    }
}
