import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //faça um algoritmo que receba um valor que foi depositado e exiba o valor com
        //rendimento após um mês. ● Considere fixo o juro da poupança em 0,70% a. m.

        double deposito, correcao, valorFinal;
        Scanner leia = new Scanner(System.in);

        System.out.println("--- Sistema de depósito do Banco do Oeste ---");


        System.out.print("Digite o valor depositado: ");
        deposito = leia.nextDouble();


        // 0,70% é igual a 0,007 (0.70 / 100)
        correcao = deposito * 0.007;
        valorFinal = deposito + correcao;

        System.out.printf("O rendimento do depósito após um mês é de: %.2f%n", valorFinal);

        leia.close();

    }
    }
