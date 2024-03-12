import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        //Declarar uma variável
        //tipo nomeVariavel;
        String nomeAluno;
        //Entrada de dados
        nomeAluno = leitor.nextLine();
        System.out.println("Boa noite, " + nomeAluno +
                " seja bem vindo ao Shift FIAP!");
        int numero1, quadradoNumero;
        numero1 = 5; //Atribuição
        quadradoNumero = numero1 * numero1; //Atribuição + calculo
        System.out.println(numero1  + "² = " + quadradoNumero);
    }
}
