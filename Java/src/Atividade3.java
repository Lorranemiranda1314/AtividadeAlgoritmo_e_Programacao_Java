import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade3 {
    public static void main(String[] args) {
        //Leia: o nome de um vendedor, o seu salário fixo, o valor total devendas dele no mês
        // e calcule 15% de comissão das vendas.
        //Exibir no final o nome,o salário fixo e salário total mais comissão.

        Scanner leia =new Scanner(System.in);

        String nome;
        double salarioFixo, totalVendas, salarioFinal;



        System.out.print("Digite o nome do vendedor: ");
        nome = leia.nextLine();

        System.out.print("Digite o salário fixo do vendedor: ");
        salarioFixo = leia.nextDouble();

        System.out.print("Digite o total de vendas efetuadas no mês: ");
        totalVendas = leia.nextDouble();

        // Cálculo do salário final (salário fixo + 15% de comissão)
        salarioFinal = salarioFixo + (totalVendas * 0.15);


        System.out.println("\n--- Resumo ---");
        System.out.println("Nome do vendedor: " + nome);
        System.out.printf("Salário fixo: R$ %.2f\n", salarioFixo);
        System.out.printf("Salário final no final do mês: R$ %.2f\n", salarioFinal);

        leia.close();
    }
    }
