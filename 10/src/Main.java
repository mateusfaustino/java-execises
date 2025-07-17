//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] numeros = {8.5, 5.6, 7.8, 10, 6};
        double sum = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i];
        }

        media = sum / numeros.length;

        System.out.println("A média de suas notas é "+ media);

    }
}