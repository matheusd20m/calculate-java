package Formulas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Probabilidade {

    static float nA; // Nosso evento A é  → sair uma bola branca. Sabemos que n(A) = 12, ou seja, há 12 casos favoráveis.
    static float nOmega; // Quantidade de casos.número de elementos no conjunto
    static float pA; // probabilidade do evento A
    static float pB; //probabilidade do evento A nao ocorrer

    public static void probabilidade(){

        DecimalFormat df = new DecimalFormat("0.000");
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------------------------");

        System.out.println("\n(Probabilidade de Evento Único)\n");

        System.out.println("Número de resultados possíveis:");
        nOmega = entrada.nextFloat();

        System.out.println("Número de eventos ocorridos:");
        nA = entrada.nextFloat();

        System.out.println("\n\n");

        pA = (nA / nOmega);
        pB = (nOmega - nA) / nOmega;


        if(nOmega >= nA){
            System.out.println("RESULTADO\n");

            System.out.println("Probabilidade de eventos ocorrerem P(A): " + df.format(pA) + "\n");
            System.out.println("Probabilidade de eventos não ocorrerem P(B): " + df.format(pB) + "\n\n");


        } else {
            System.out.println("Número de evento ocorridos deve sempre ser inferior ao número de resultados possíveis\n");
        }

    }

    public Probabilidade() {
    }

    public static float getnA() {
        return nA;
    }

    public static void setnA(float nA) {
        Probabilidade.nA = nA;
    }

    public static float getnOmega() {
        return nOmega;
    }

    public static void setnOmega(float nOmega) {
        Probabilidade.nOmega = nOmega;
    }

    public static float getpA() {
        return pA;
    }

    public static void setpA(float pA) {
        Probabilidade.pA = pA;
    }

    public static float getpB() {
        return pB;
    }

    public static void setpB(float pB) {
        Probabilidade.pB = pB;
    }
}
