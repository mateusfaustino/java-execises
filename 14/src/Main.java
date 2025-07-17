import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("🌍 Planetas e suas gravidades:");
        Scanner scanner = new Scanner(System.in);

        for  (Planets planet : Planets.values()) {
            System.out.println(planet+" - Gravidade: "+ planet.getGravity());
        }
        System.out.println("Digite seu peso na Terra: ");
        double pesoNaTerra = scanner.nextDouble();

        System.out.println("Seu peso em cada planeta:");
        for (Planets planet : Planets.values()) {
            System.out.println(planet+": "+planet.getPeso(pesoNaTerra));
        }


    }
}