public class Calculadora {
    public static void operacao(double n1, double n2, String op){

        if(op == "/"){
            double resultado = n1 / n2;
            System.out.print("A divisão dos dois números é: " + resultado);
        }
        else if (op == "x") {
            double resultado = n1 * n2;
            System.out.print("A multiplicação dos dois números é: " + resultado);
        }
        else if (op == "+") {
            double resultado = n1 + n2;
            System.out.print("A soma dos dois números é: " + resultado);
        }
        else if (op == "-") {
            double resultado = n1 - n2;
            System.out.print("A subtração dos dois números é: " + resultado);
        }
    }
}
