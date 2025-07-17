//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.print(dia+":");

            switch (dia) {
                case SEGUNDA:
                    System.out.println("Começo da semana. Bora trabalhar!");
                    break;
                case TERCA:
                    System.out.println("Dia de manter o ritmo.");
                    break;
                case QUARTA:
                    System.out.println("Metade da semana. Força!");
                    break;
                case QUINTA:
                    System.out.println("Quase lá! Continua firme.");
                        break;
                case SEXTA:
                    System.out.println("Sextou! Hora de planejar o descanso.");
                    break;
                case SABADO:
                    System.out.println("Dia de relaxar ou se divertir.");
                    break;
                case DOMINGO:
                    System.out.println("Dia de descanso e preparação para a semana.");
            }
        }
    }
}