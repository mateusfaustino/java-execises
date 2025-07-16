import operador.Operador;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);

        String operador;

        System.out.println("Num 1");
        num2 = sc.nextDouble();

        System.out.println("Num 2");
        num1 = sc.nextDouble();

        System.out.println("operador");
        operador = sc.next();

        Operador op = Operador.fromSimbolo(operador);

        double resultado = op.operar(num1, num2);
        System.out.println(num1 + " " +op.getSimbolo()+ " " + num2 + " = " + resultado);

    }
}