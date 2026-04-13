import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos
        //(aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%.
//Escrever um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo.

        Scanner leia = new Scanner(System.in);

        double custoFabrica, valorComImpostos, custoFinal;
        double percImpostos = 0.45; // 45%
        double percDistribuidor = 0.28; // 28%


        System.out.print("Digite o custo de fábrica do veículo: R$ ");
        custoFabrica = leia.nextDouble();


        valorComImpostos = custoFabrica + (custoFabrica * percImpostos);


        custoFinal = valorComImpostos + (valorComImpostos * percDistribuidor);


        System.out.printf("O custo final ao consumidor é: R$ %.2f%n", custoFinal);

        leia.close();
    }
}