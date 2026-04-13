import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com
        //desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser
       //pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o
        //ano do veículo. Até 2010 - 12% e acima de 2010 - 7%. O sistema deverá perguntar se
        //deseja continuar calculando desconto até que a resposta digite: “(N) Não” . Informar
       // total de carros com ano até 2010 e total geral.

        Scanner leia = new Scanner(System.in);

        String desejaContinuar = "S";
        int totalAte2010 = 0;
        int totalGeral = 0;

        while (desejaContinuar.equalsIgnoreCase("S")) {
            System.out.print("Digite o valor do veículo: ");
            double valorVeiculo = leia.nextDouble();

            System.out.print("Digite o ano do veículo: ");
            int anoVeiculo = leia.nextInt();

            double valorDesconto;

            // Lógica do desconto
            if (anoVeiculo <= 2010) {
                valorDesconto = valorVeiculo * 0.12;
                totalAte2010++;
            } else {
                valorDesconto = valorVeiculo * 0.07;
            }

            double valorFinal = valorVeiculo - valorDesconto;

            System.out.printf("Desconto: %.2f\n", valorDesconto);
            System.out.printf("Valor final: %.2f\n", valorFinal);

            totalGeral++;

            System.out.print("Deseja continuar? (S/N): ");
            desejaContinuar = leia.next();
        }

        System.out.println("Total de carros até 2010: " + totalAte2010);
        System.out.println("Total geral de carros: " + totalGeral);

        leia.close();
    }
    }
