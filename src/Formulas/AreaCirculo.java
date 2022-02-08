package Formulas;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaCirculo {

    static float A;
    static float P = (float) 3.1415926535898;
    static float r;
    static float d;



    static DecimalFormat df = new DecimalFormat("0.00"); // formatando em 2 casas decimais

    public static void areacirculo(){

        Scanner entrada = new Scanner(System.in);

        StringBuilder texto = new StringBuilder(); // criando uma opcao de escolha
        texto.append("\n\nEscolha uma opcao:  \n");
        texto.append("1 - Formula do (Raio) \n");
        texto.append("2 - Formula do (Diâmetro) \n\n");
        texto.append("0 - Voltar ao Menu \n");

        System.out.println(texto.toString());
        int escolha = entrada.nextInt();

        //VERIFICANDO A ESCOLHA DO USUARIO

        do {
            switch (escolha) {
                case 1:
                    System.out.println("Digite o Raio: (m)");
                    r = entrada.nextFloat();

                    A = (float) (P * Math.pow(r, 2));

                    System.out.println("\n\nRESULTADO--------------------\n\n");
                    System.out.println("Área do círculo: (π * " + (int) r + "²)\n");
                    System.out.println("Área do círculo: " + df.format(A) + "m²\n\n");

                    break;
                case 2:

                    System.out.println("Digite o Diâmetro: (m)");
                    d = entrada.nextFloat();

                    A = (float) (P * Math.pow(d, 2) / 4);

                    System.out.println("\n\nRESULTADO--------------------\n\n");
                    System.out.println("Área do círculo: (π * " + (int) d + "²) / 4 \n");
                    System.out.println("Área do círculo: " + df.format(A) + "m²\n\n");
                    break;
                default:
                    System.out.println("\n----------------------\n");
                    System.out.println("Opção Inválida tente Novamente\n\n");
                    break;

            }

            if (escolha != 1 && escolha != 2) {
                if (escolha != 0) {

                    System.out.println(texto.toString());
                    entrada = new Scanner(System.in);
                    escolha = entrada.nextInt();

                }
            }

            if((escolha == 1 || escolha == 2)) {
                if (escolha == 1) {
                    escolha = 0;
                }
                if (escolha == 2) {
                    escolha = 0;
                }
            }
        }
        while (escolha != 0);
    }

    public AreaCirculo() {
    }

    public static float getA() {
        return A;
    }

    public static void setA(float a) {
        A = a;
    }

    public static float getP() {
        return P;
    }

    public static void setP(float p) {
        P = p;
    }

    public static float getR() {
        return r;
    }

    public static void setR(float r) {
        AreaCirculo.r = r;
    }

    public static float getD() {
        return d;
    }

    public static void setD(float d) {
        AreaCirculo.d = d;
    }

    public static DecimalFormat getDf() {
        return df;
    }

    public static void setDf(DecimalFormat df) {
        AreaCirculo.df = df;
    }


}
