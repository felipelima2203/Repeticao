import java.util.Scanner;

public class For_Exec_1 {

    public static void main(String[] args) {
        int value=0, i=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor entre 1 e 1000");
        value = sc.nextInt();

        if (value<1 || value>1000){
            System.out.println("Fora do intervalo");
        }else{
            for (i=0; i<=value; i++)
            {
                if (i%2!=0){
                    System.out.println(i);
                }
            }
        }
    sc.close();
    }
}
