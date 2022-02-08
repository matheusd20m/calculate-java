public class Builder {
    public static void builder(){
        StringBuilder builder = new StringBuilder();
        builder.append("*********************************************** \n\n");
        builder.append("Escolha uma opcao de Calculadora:  \n");
        builder.append("1 - Delta \n");
        builder.append("2 - PI \n");
        builder.append("3 - Juros \n ");
        builder.append("4 - Equação do segundo grau \n ");
        builder.append("5 - Probalidade  \n ");
        builder.append("6 - Área: Retângulo  \n");
        builder.append("7 - Área: Trapézio  \n");
        builder.append("8 - Área: Círculo  \n");
        builder.append("9 - Porcentagem  \n");
        builder.append("0 - Sair  \n");

        System.out.println(builder.toString());
    }
}
