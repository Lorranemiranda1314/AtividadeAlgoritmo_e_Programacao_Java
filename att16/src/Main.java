import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Escreva um Algoritmo para demonstrar as
        // operações matemáticas básicas e mostre o resultado para cada operador.
       Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = leia.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = leia.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;
        double resto = numero1 % 3; // O resto do número1 dividido por 3

        System.out.println("\n--- Demonstração de Operações Matemáticas Básicas ---");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("---------------------------------------------------");

        System.out.println("Soma (+): " + numero1 + " + " + numero2 + " = " + soma);
        System.out.println("Subtração (-): " + numero1 + " - " + numero2 + " = " + subtracao);
        System.out.println("Multiplicação (*): " + numero1 + " * " + numero2 + " = " + multiplicacao);
        System.out.println("Divisão (/): " + numero1 + " / " + numero2 + " = " + divisao);
        System.out.println("Resto da Divisão (%): " + numero1 + " % 3 = " + resto);

        leia.close(); // Boa prática fechar o scanner
    }
}
