package Formulas;
import java.util.Scanner;


public class Juros {

    static float juros;
    static float capital;
    static float taxa;
    static float tempo;

    public static void juros(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Capital Inicial (R$)");
        capital = entrada.nextFloat();
        System.out.println("Digite a taxa de juros (%)");
        taxa = entrada.nextFloat();
        System.out.println("Digite o tempo de aplicação (mês)");
        tempo = entrada.nextFloat();

        juros = capital * taxaDeJuros() * tempo;
        System.out.printf( "%s%.2f%s","\nO valor dos juros da aplicação é de R$: ",juros,"\n\n");

        juros += capital;
        System.out.printf( "%s%.2f%s","E o montante a ser resgatado é de R$: ",juros,"\n \n");
    }

    public static float taxaDeJuros(){
        double percentual = taxa / 100;
        return (float) percentual;
    }


    public Juros() {
    }

    public static float getJuros() {
        return juros;
    }

    public static void setJuros(float juros) {
        Juros.juros = juros;
    }

    public static float getCapital() {
        return capital;
    }

    public static void setCapital(float capital) {
        Juros.capital = capital;
    }

    public static float getTaxa() {
        return taxa;
    }

    public static void setTaxa(float taxa) {
        Juros.taxa = taxa;
    }

    public static float getTempo() {
        return tempo;
    }

    public static void setTempo(float tempo) {
        Juros.tempo = tempo;
    }
}
