import java.util.Locale;
import java.util.Scanner;

public class For_Exec_3 {
    public static void main(String[] args) {
        int cases=0;
        float value1, value2, value3, media=0;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de casos");
        cases = sc.nextInt();

        for (int i=0; i<cases; i++){

            System.out.println("Digite o primeiro valor (peso 2)");
            value1 = sc.nextFloat();
            System.out.println("Digite o segundo valor (peso 3)");
            value2 = sc.nextFloat();
            System.out.println("Digite o terceiro valor (peso 5)");
            value3 = sc.nextFloat();

            media  = ((value1*2) + (value2*3) + (value3*5))/10;

            System.out.printf("Média ponderada do teste %d é %.1f\n", (1+i), media);

        }
    }
}
