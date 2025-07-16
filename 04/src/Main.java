import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int n = sc.nextInt();

        String paridade="ímpar";

        if(n%2==0){
            paridade="par";
        }

        System.out.println("O número "+ n +" é "+ paridade);

        sc.close();


    }
}