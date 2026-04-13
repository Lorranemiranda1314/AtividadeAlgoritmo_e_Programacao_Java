import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade15 {
    public static void main(String[] args) {
        //Escreva um Algoritmo que receba 4 valores em variáveis diferentes, contendo INTEIRO,
        // REAL, CARACTERE e
        // BOOLEANO e mostre na tela os valores atribuídos às variáveis.

Scanner leia = new Scanner(System.in);


        System.out.print("Digite um valor inteiro: ");
    int valorInteiro = leia.nextInt();

        System.out.print("Digite um valor real (decimal): ");
    double valorReal =leia.nextDouble();


        System.out.print("Digite um único caractere: ");
    char valorChar = leia.next().charAt(0);


        System.out.print("Digite um valor booleano (true/false): ");
    boolean valorLogico = leia.nextBoolean();

  
        System.out.println("\n--- Valores Recebidos ---");
        System.out.println("Inteiro: " + valorInteiro);
        System.out.println("Real: " + valorReal);
        System.out.println("Caractere: " + valorChar);
        System.out.println("Booleano: " + valorLogico);

        leia.close();
}
}