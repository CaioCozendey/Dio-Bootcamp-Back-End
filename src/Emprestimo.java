public class Emprestimo {

    public static void calcular(double valor, int parcelas, double taxa){

        double novaTaxa = taxa/100;
        double montante = 0;
        double anterior = 0.0;

        for(int i = 1; i <= parcelas; i++){
            montante = valor * Math.pow((1 + novaTaxa), i);
            double juros = montante - valor - anterior;

            anterior += juros;
        }

        System.out.printf("Total: %.2f %n", montante);
        System.exit(0);

    }

}
