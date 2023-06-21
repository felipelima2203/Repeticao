import java.util.Scanner;

public class For_Exec_5 {
    public static void main(String[] args) {
        int value=0, fat=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor");
        value = sc.nextInt();

        for (int i=1; i<=value; i++){
            fat = fat * i;
        }

        System.out.println("Fatorial = " + fat);
    }
}
