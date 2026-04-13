import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$).
        //O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.
// Criação do scanner para leitura de dados
        Scanner leia = new Scanner(System.in);


        double dolares, cotacao, reais;


        System.out.print("Digite o valor em dólares (US$): ");
        dolares = leia.nextShort();

        System.out.print("Digite a cotação do dólar (R$): ");
        cotacao = leia.nextDouble();


        reais = dolares * cotacao;


        System.out.printf("Valor em reais (R$): %.2f%n", reais);


        leia.close();

      }
    }
