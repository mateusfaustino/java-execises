import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = sc.nextInt();

        System.out.println("TABUADA DO "+n);
        int aux;
        for(int i = 0; i < 10; i++) {
            aux = n*i;
            System.out.println(n+" x "+i+" = "+aux);
        }
    }
}