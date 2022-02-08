package Formulas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Porcentagem {
    static float a;
    static float b;
    static float c;
    static float d;

    static float resultado;
    static float resultado1;

    public static void porcentagem(){

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        StringBuilder texto = new StringBuilder();

        texto.append("\n\nEscolha uma opcao:  \n");
        texto.append("1 - O (Valor) é Qual (%) do (Valor): \n");
        texto.append("2 - Qual (%) do (Valor): \n\n");

        System.out.println(texto.toString());
        int escolha = entrada.nextInt();

        switch (escolha){
            case 1:

                System.out.println("\n\nO valor: ");
                a = entrada.nextFloat();

                System.out.println("\nÉ qual porcentagem(%) de :");
                b = entrada.nextFloat();
                resultado = a * 100 / b;

                System.out.println("\n\nResultado-----------------------\n\n");

                System.out.println( );
                System.out.println("O Valor " + a + ",\nCorresponde a : " + df.format(resultado) + "%\nDe " + b + "\n\n");
                break;
            case 2:

                System.out.println("\n\nQuanto é -- % : ");
                c = entrada.nextFloat();

                System.out.println("\nDe :");
                d = entrada.nextFloat();

                resultado1 = c / 100 * d;

                System.out.println("\n\nResultado-----------------------\n\n");

                System.out.println(c + "% de " + d);
                System.out.println("Corresponde a : " + df.format(resultado1) + "\n\n");
                break;
            default:
                System.out.println("\n\nOpção Inválida, Você voltou ao Menu .\n\n");


        }



    }

    public Porcentagem() {
    }

    public static float getA() {
        return a;
    }

    public static void setA(float a) {
        Porcentagem.a = a;
    }

    public static float getB() {
        return b;
    }

    public static void setB(float b) {
        Porcentagem.b = b;
    }

    public static float getC() {
        return c;
    }

    public static void setC(float c) {
        Porcentagem.c = c;
    }

    public static float getD() {
        return d;
    }

    public static void setD(float d) {
        Porcentagem.d = d;
    }

    public static float getResultado() {
        return resultado;
    }

    public static void setResultado(float resultado) {
        Porcentagem.resultado = resultado;
    }

    public static float getResultado1() {
        return resultado1;
    }

    public static void setResultado1(float resultado1) {
        Porcentagem.resultado1 = resultado1;
    }
}
