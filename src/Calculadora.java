import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        //variáveis -> são espaços na memória RAM (int, double, char, String)
        int numero1, numero2;
        double soma, subtracao, multiplicacao, divisao;

        //String nome = leitorTexto.nextLine();

        //Comando de saída
        System.out.println("CALCULADORA");
        System.out.println("Digite um número: ");
        //Entrada de dados
        numero1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextInt();

        //Calculos -> Processamentos
        soma = numero1 + numero2;
        System.out.println("A soma é: " + String.format("%.0f",soma));

        subtracao = numero1 - numero2;
        System.out.println("A subtração: " + subtracao);
        multiplicacao = numero1 * numero2;
        divisao = (double) numero1 / numero2;
        System.out.println("A multiplicação: " + multiplicacao
        + "\nA divisão = " + divisao);

        double teste = 258.89;
        int x = (int) teste;
        System.out.println("x = " + x);
        System.out.println("Teste = " + teste);
        leitorTexto.close();
        leitor.close();
    }
}
