import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("número 1:");
        int number1 = scanner.nextInt();

        System.out.println("Número 2:");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.println(number1 + " + " + number2 + " = " + sum);
    }
}