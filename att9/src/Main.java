import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Escrever um algoritmo que leia dois valores distintos inteiros e informe qual é o maior e
// diga se este número maior está no intervalo entre 1 a 99 100 e 199 ou maior que 200.
        Scanner leia = new Scanner(System.in);
        int numero1, numero2, numeroMaior;

        // 1. Leitura dos dados
        System.out.print("Digite o primeiro número inteiro: ");
        numero1 = leia.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        numero2 = leia.nextInt();

        // 2. Verificação de qual é o maior
        if (numero1 > numero2) {
            System.out.println("O primeiro número é o maior: " + numero1);
            numeroMaior = numero1;
        } else {
            System.out.println("O segundo número é o maior: " + numero2);
            numeroMaior = numero2;
        }

        // 3. Verificação do intervalo do número maior
        if (numeroMaior >= 1 && numeroMaior <= 99) {
            System.out.println("Está no intervalo entre 1 e 99.");
        } else if (numeroMaior >= 100 && numeroMaior <= 199) {
            System.out.println("Está no intervalo entre 100 e 199.");
        } else if (numeroMaior >= 200) {
            System.out.println("Está no intervalo maior ou igual a 200.");
        } else {
            System.out.println("O número é menor que 1.");
        }

        leia.close();

        }
    }
