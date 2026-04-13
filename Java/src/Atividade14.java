import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade14 {
    public static void main(String[] args) {
        // Escreva um algoritmo e um fluxograma que receba dois números e exiba o resultado da sua soma

        Scanner leia = new Scanner(System.in);

        int num1, num2, soma;

        System.out.print("Digite o primeiro número: ");
        num1 = leia.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = leia.nextInt();


        soma = num1 + num2;

       
        System.out.println("A soma é: " + soma);


      leia.close();

        }
    }
