package Formulas;

import java.util.Scanner;

public class Pi {

    static float perimetro;
    static float pi;
    static float diametro;


    public static void pi(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do perímetro");
        perimetro = entrada.nextFloat();
        System.out.println("Digite o valor do Diâmetro");
        diametro = entrada.nextFloat();
        pi = perimetro / diametro;

        System.out.println("\n\nπ = Perímetro / Diâmetro");
        System.out.println("π = " + pi + "\n\n");

    }


    public Pi() {
    }

    public static float getPerimetro() {
        return perimetro;
    }

    public static void setPerimetro(float perimetro) {
        Pi.perimetro = perimetro;
    }

    public static float getPi() {
        return pi;
    }

    public static void setPi(float pi) {
        Pi.pi = pi;
    }

    public static float getDiametro() {
        return diametro;
    }

    public static void setDiametro(float diametro) {
        Pi.diametro = diametro;
    }
}
