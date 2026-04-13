import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade10 {
    public static void main(String[] args) {
        //Escrever um algoritmo que leia o nome e as três notas obtidas por um aluno de 0 a 10
        //durante o semestre. Calcular a soma das notas e sua média (aritmética), informar o
        //nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação
       // (média entre 5.1 a 6.9).
        Scanner leia= new Scanner(System.in);

        // Declaração de variáveis
        String nome;
        double n1, n2, n3, soma, media;

        // Entrada de dados
        System.out.print("Digite o nome do aluno: ");
        nome = leia.nextLine();

        System.out.print("Digite a primeira nota: ");
        n1 =leia.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = leia.nextDouble();

        System.out.print("Digite a terceira nota: ");
        n3 = leia.nextDouble();

        soma = n1 + n2 + n3;
        media = soma / 3;


        System.out.println("\nAluno: " + nome);
        System.out.printf("Média: %.1f\n", media);


        if (media >= 7) {
            System.out.println("Situação: APROVADO");
        } else if (media <= 5) {
            System.out.println("Situação: REPROVADO");
        } else {
            System.out.println("Situação: RECUPERAÇÃO");
        }

        leia.close();
    }
    }
