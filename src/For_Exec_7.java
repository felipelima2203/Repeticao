import java.util.Scanner;

public class For_Exec_7 {
    public static void main(String[] args) {
        int value =0;
        double sqrd=0, cube=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor");
        value = sc.nextInt();

        for (int i=1; i<=value; i++){
            sqrd = Math.pow(i, 2);
            cube = Math.pow(i, 3);
            System.out.printf("%d, %.0f, %.0f\n", i, sqrd, cube);
        }
        sc.close();
    }
}
