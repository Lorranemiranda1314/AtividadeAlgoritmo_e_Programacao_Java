import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade11 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando
//“maior de idade” e “menor de idade” e “idoso”para cada pessoa.Considere a idade a
        //partir de 18 anos como maior de idade e idoso a partir de 60 anos.
        Scanner leia = new Scanner(System.in);
        int idade;

        // Repetição para receber dados de 75 pessoas
        for (int i = 1; i <= 75; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = leia.nextInt();

            // Classificação das idades
            if (idade >= 60) {
                System.out.println("Pessoa " + i + ": Idoso");
                idade =leia.nextInt();
            } else if (idade >= 18) {
                System.out.println("Pessoa " + i + ": Maior de idade");
                idade = leia.nextInt();
            } else {
                System.out.println("Pessoa " + i + ": Menor de idade");
                idade = leia.nextInt();
            }
        }

        leia.close(); // Fecha o scanner
    }
}

