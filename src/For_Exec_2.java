import java.util.Scanner;

public class For_Exec_2 {
    public static void main(String[] args) {
        int i=0, value=0, in=0, out=0, input=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro");
        value  = sc.nextInt();

        for (i=0; i<value; i++){
            System.out.println("Digite um valor para a posição " + (1+i));
            input = sc.nextInt();
            if ((input < 10) || (input > 20)){
                out++;
            }else {
                in++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
