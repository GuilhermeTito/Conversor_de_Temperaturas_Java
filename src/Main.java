import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        float temp1, temp2;
        int tipo1, tipo2;

        System.out.println("Escolha a medida a ser convertida: \n1-Celsius\n2-Fahrenheit\n3-Kelvin");
        tipo1 = leitor.nextInt();

        System.out.println("Digite a temperatura a ser convertida:");
        temp1 = leitor.nextFloat();

        System.out.println("Escolha para qual medida deseja converter: \n1-Celsius\n2-Fahrenheit\n3-Kelvin");
        tipo2 = leitor.nextInt();

        temp2 = conversor(temp1, tipo1, tipo2);

        System.out.println("Resultado:\n"+temp2);

    }

    static float conversor(float temp1, int tipo1, int tipo2)
    {
        // 1 = C, 2 = F, 3 = K
        switch (tipo1) {
            case 1 -> {
                return switch (tipo2) {
                    case 1 -> temp1;                // C para C
                    case 2 -> temp1 * 1.8f + 32;    // C para F
                    case 3 -> temp1 + 273.15f;      // C para K
                    default -> 0;
                };
            }
            case 2 -> {
                return switch (tipo2) {
                    case 1 -> (temp1 - 32) * 5 / 9;             // F para C
                    case 2 -> temp1;                            // F para F
                    case 3 -> (temp1 - 32) * 5 / 9 + 273.15f;   // F para K
                    default -> 0;
                };
            }
            case 3 -> {
                return switch (tipo2) {
                    case 1 -> temp1 - 273.15f;                  // K para C
                    case 2 -> (temp1 - 273.15f) * 9 / 5 + 32;   // K para F
                    case 3 -> temp1;                            // K para K
                    default -> 0;
                };
            }
            default ->{
                return 0;
            }
        }
    }
}