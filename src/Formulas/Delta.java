package Formulas;

import java.util.Scanner;

public class Delta {

    static int a ;
    static int b;
    static int c;
    static float delta;

    public static void delta(){

        System.out.println("\n ∆ = b² - 4.a.c \n");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor de a: ");
        a = entrada.nextInt();

        System.out.print("Valor de b: ");
        b = entrada.nextInt();

        System.out.print("Valor de c:");
        c = entrada.nextInt();

        System.out.println("\n ∆ =  b² - 4.a.c");
        System.out.println("\n ∆ = " + b + "²" + " - " + "4." + a + "." + c );
        System.out.println("\n ∆ = " + (int)Math.pow(b,2) + " - " + "4." + a + "." + c );
        delta = (float)Math.pow(b,2) - 4*a*c;

        System.out.println("\n ∆ = " + delta + "\n \n");

        return;
    }

    public Delta() {
    }

    public static int getA() {return a; }

    public static void setA(int a) {
        Delta.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Delta.b = b;
    }

    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        Delta.c = c;
    }

    public static float getDelta() {
        return delta;
    }

    public static void setDelta(float delta) {
        Delta.delta = delta;
    }
}
