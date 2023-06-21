import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        int num, i, in=0, out=0, value;


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro (número de vezes)");
        num = sc.nextInt();

        for (i=0; i<num; i++){
            System.out.println("Digite um valor");
            value = sc.nextInt();

            if (value<10||value>20){
                out++;
            }else {
                in++;
            }
        }

        System.out.println("in: " + in);
        System.out.println("out: " + out);

        sc.close();
    }
}
