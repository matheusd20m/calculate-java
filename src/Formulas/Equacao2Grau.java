package Formulas;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Equacao2Grau {
        static int a;
        static int b;
        static int c;
        static float delta;
        static float raizdelta;

    public static void equacao2Grau(){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor de a: ");
        a = entrada.nextInt();

        System.out.print("Valor de b: ");
        b = entrada.nextInt();

        System.out.print("Valor de c:");
        c = entrada.nextInt();

        delta = (int) Math.pow(b, 2) - (4 * a * c);
        raizdelta = (float) Math.sqrt(delta);

        System.out.println("---------------");

        System.out.println("Equação: " + " " + a + "x²" + " + " + b + "x" + " " + c );
        System.out.println("---------------");
        System.out.println("✓ a = " + a);
        System.out.println("✓ b = " + b);
        System.out.println("✓ c = " + c + "\n");
        System.out.println("RESULTADO-----------------\n");

        System.out.println("Fórmula Resolvente: X = -b ± √b²-4.a.c / 2.a\n" );

        System.out.println("X = " + "-" + "(" + b + ")" + " ± " + " √" + (b) + "²" + "-"
                + "4." + "("+ a + ")" + "(" + c + ")" + " /" + "2" + "x" + "(" + a + ")" );

        System.out.println("X = " + (-b) + " ± " + " √" + (int) Math.pow(b,2) + "-" + "("
                + (4*a*c) + ")" + " /" + (2*a) );

        System.out.println("X = " + (-b) + " ± " + " √" + new DecimalFormat("#0.##").format(delta)
                + " /" + (2*a) );

        System.out.println("X = " + (-b) + "+" +  new DecimalFormat("#0.##").format(raizdelta)
                + " /" + (2*a) + " |     " + "X = " + (-b)
                + "-" +  new DecimalFormat("#0.##").format(raizdelta) + " /" + (2*a) );


        System.out.println("X = " + new DecimalFormat("#0.##").format(( -b + raizdelta )) + "/" + (2*a)
                + "     |     " +
                "X = " + new DecimalFormat("#0.##").format(( -b - raizdelta )) + "/" + (2*a) + "\n");

        if (a != 0 && b != 0 && c != 0) if (delta > 0) {

            double x1;
            x1 = (-(b) + raizdelta) / (2 * a);

            double x2;
            x2 = (-(b) - raizdelta) / (2 * a);

            System.out.printf("S = { " + new DecimalFormat("#0.##").format(x1) + " , "
                    + new DecimalFormat("#0.##").format(x2) + " }\n\n" );

        } else {
            System.out.println("x¹ = " + (-b) + " +" + " √" + delta + " / " + 2 + "*" + a );
            System.out.println("x² = " + (-b) + " -" + " √" + delta + " / " + 2 + "*" + a );
            System.out.println("A equação de 2º grau não possui raízes reais!\n \n");
        }

    }


    public Equacao2Grau() {
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Equacao2Grau.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Equacao2Grau.b = b;
    }

    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        Equacao2Grau.c = c;
    }

    public static float getDelta() {
        return delta;
    }

    public static void setDelta(float delta) {
        Equacao2Grau.delta = delta;
    }

}