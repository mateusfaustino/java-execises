//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("🌍 Planetas e suas gravidades:");

        for  (Planets planet : Planets.values()) {
            System.out.println(planet+" - Gravidade: "+ planet.getGravity());
        }
    }
}