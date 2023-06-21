import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {

        int num, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 1000");
        num = sc.nextInt();
        if (num<1 || num>1000){
            System.out.println("Fora do intervalo");
        }else{
            for (i=0; i<=num; i++){
                if (i%2!=0) System.out.println(i);
            }
        }

        sc.close();


    }
}