import Formulas.*;

import java.util.Scanner;
public class ProjetoIntegrador {

    public static void main (String[] agrs){


            Scanner scanner = new Scanner(System.in);


            Delta delta = new Delta();
            Pi pi = new Pi();
            Juros juros = new Juros();
            Equacao2Grau equacao2Grau = new Equacao2Grau();
            Probabilidade probabilidade = new Probabilidade();
            AreaRetangulo areaRetangulo = new AreaRetangulo();
            AreaTrapezio areaTrapezio = new AreaTrapezio();
            AreaCirculo areaCirculo = new AreaCirculo();
            Porcentagem porcentagem = new Porcentagem();

            Builder builder = new Builder();
            builder.builder();

            int op = scanner.nextInt();

            do{
                switch(op){
                    case 1:
                        delta.delta();
                        break;
                    case 2:
                        pi.pi();
                        break;
                    case 3:
                        juros.juros();
                        break;
                    case 4:
                        equacao2Grau.equacao2Grau();
                        break;
                    case 5:
                        probabilidade.probabilidade();
                        break;
                    case 6:
                        areaRetangulo.areaRetangulo();
                        break;
                    case 7:
                        areaTrapezio.areaTrapezio();
                        break;
                    case 8:
                        areaCirculo.areacirculo();
                        break;
                    case 9:
                        porcentagem.porcentagem();
                        break;
                    case 0:
                    default:
                        break;

                }
                if (op != 0) {
                builder.builder();
                scanner = new Scanner(System.in);
                op = scanner.nextInt();
                }else{
                    break;
                }
            }
            while(op != 0 );
        }
}
