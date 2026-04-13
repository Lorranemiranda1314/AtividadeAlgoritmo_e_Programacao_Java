import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ler a temperatura em grus celsius e apresentá-la convertida em graus fahrenheit.
//A fórmula de conversão é: F=(9*c+160)/5, sendo f a temperatura em fahrinheit  c a tempratura em celsius


        double c, f;
        Scanner leia = new Scanner(System.in);


        System.out.print("Digite a temperatura em Celsius: ");
        c = leia.nextDouble();


        f = (9 * c + 160) / 5;

        
        System.out.println("A temperatura em Fahrenheit é: " + f);

        leia.close();
    }
    }
