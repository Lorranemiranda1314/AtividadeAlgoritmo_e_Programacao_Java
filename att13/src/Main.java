import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        //Faça uma função que recebe, por parâmetro um valor N, um valor O e um valor T e calcule e escreve a taboada de 1 até T.
//Mostre a taboada na forma: Onde “N” é o valor de calculo da taboada “O” é o operador da tabuada e “T” é o ultimo numero que será
        //realizado a conta da tabuada.
//Exemplo, n = 5, O = “S” e T = 10, irá fazer a tabuada de soma do numero 5 até chegar no numero 10.


        Scanner leia= new Scanner(System.in);

        System.out.print("Quer ver a tabuada de qual número (N)? ");
        int n = leia.nextInt();
        System.out.print("Qual número quer que a tabuada pare (T)? ");
        int t = leia.nextInt();
        System.out.print("Insira o operador (+, -, *, /): ");
        char o = leia.next().charAt(0);

        calcularTabuada(n, o, t);
       leia.close();
    }

    public static void calcularTabuada(int n, char o, int t) {
        System.out.println("\n--- Resultado da Tabuada ---");
        for (int cont = 1; cont <= t; cont++) {
            double resultado = 0;
            switch (o) {
                case '+' : resultado = n + cont; break; // 2. ASPAS CORRIGIDAS
                case '-' : resultado = n - cont; break;
                case '*' : resultado = n * cont; break;
                case '/' :
                    if (cont == 0) { // Tratamento para divisão por zero se necessário
                        System.out.println("Erro: Divisão por zero");
                        return;
                    }
                    resultado = (double) n / cont;
                    break;
                default:
                    System.out.println("Operador inválido!");
                    return;
            }

            if (o == '/') {
                System.out.printf("%d %c %d = %.2f%n", n, o, cont, resultado);
            } else {
                System.out.printf("%d %c %d = %.0f%n", n, o, cont, resultado);
            }
        }
    }
}