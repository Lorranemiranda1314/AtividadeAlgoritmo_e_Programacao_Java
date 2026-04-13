import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade1 {
    public static void main(String[] args) {
        //Ler dois valores ex: A e B, e efetuar as trocas dos valores de
//forma que a variável A passe a possuir o valor da variável B e a
//variável B passe a possuir o valorda variável A.
// Exibir o resultado fina
        Scanner leia = new Scanner(System.in);

        int valorA, valorB, temporaria;
        System.out.printf("digite o valor A");
        valorA= leia.nextInt();

        System.out.println("digite valor B");
        valorB = leia.nextInt();

        temporaria  = valorA;

        valorA =valorB;

        valorB = temporaria;

        System.out.println("o valor da invesão para A é:"+valorA);
        leia.nextInt();
        System.out.println("o valor da invesão para B é:"+ valorB);
        leia.nextInt();

        leia.close();
    }

}