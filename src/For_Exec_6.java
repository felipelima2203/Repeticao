import java.util.Scanner;

public class For_Exec_6 {
    public static void main(String[] args) {
        int value =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor");
        value = sc.nextInt();

        for (int i=1; i<=value; i++){
            if (value%i==0){
                System.out.println(i);
            }
        }
    }
}
