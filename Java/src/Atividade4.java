import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade4 {
    public static void main(String[] args){
        //Escrever um algoritmo para determinar o consumo médio de um automóvel sendo
        //fornecida a distância total percorrida pelo automóvel e o total de combustível gasto
        Scanner leia = new Scanner(System.in);

        System.out.print("Distancia total percorrida (km): ");
        double distanciaTotal = leia.nextDouble();

        System.out.print("Total de combustivel gasto (litros): ");
        double totalCombustivelGasto = leia.nextDouble();

        // Cálculo do consumo médio
        double consumoMedio = distanciaTotal / totalCombustivelGasto;

        // Exibe o resultado com 3 casas decimais
        System.out.printf("Consumo medio: %.3f km/l%n", consumoMedio);

        leia.close();

    }

    }
