import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {   //Escrever um algoritmo
        // que leia o nome de um aluno e as notas das
//três provas que ele obteve no semestre.No final informar nome do
//aluno e a sua média (aritmética).

        Scanner leia = new Scanner(System.in);

        float prova1, prova2, prova3, media; // numeros reais ou seja ex: 3.3
        String nome;



        System.out.println( "Digite su nome:   " );
        nome = leia.nextLine();

        System.out.println ( "Digite nota da prova 1: " );
        prova1 = leia.nextFloat();

        System.out.println ( "Digite nota da prova 2: ");
        prova2 = leia.nextFloat();
        System.out.println ( "Digite nota da prova 3: ");
        prova3 = leia.nextFloat();


        media = (prova1 + prova2 + prova3)/3;

        System.out.println( "A media aritmetica "+ media);
        System.out.println(" o nome digitado foi: "+ nome);
        }
    }
