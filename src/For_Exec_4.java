import java.util.Scanner;

public class For_Exec_4 {

    public static void main(String[] args) {
        int pairs=0;
        int value1, value2;
        float div=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de pares");
        pairs = sc.nextInt();

        for (int i =0; i<pairs; i++){
            System.out.println("Digite o primeiro valor");
            value1 = sc.nextInt();
            System.out.println("Digite o segundo valor");
            value2 = sc.nextInt();

            if (value2==0){
                System.out.println("Divisão impossível");
            }else{
                div = (float) value1/value2;
                System.out.printf("%d / %d = %.1f\n", value1, value2, div);
            }

        }


        sc.close();
    }
}
