import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        String signal="negativo";

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = sc.nextInt();

        if (isZero(num)) {
            signal="zero";
        }

        if (isPositive(num)) {
            signal="positivo";
        }

        System.out.println("O núemero "+num+" é "+signal);
    }

    public static boolean isZero(int d) {
        return (d == 0);
    }

    public static boolean isPositive(int d) {
        return (d > 0);
    }

}