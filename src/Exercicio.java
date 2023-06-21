import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
       int t, m, c;

       t=1;
       m=5;
       c=10;

       c = c * (1+t);

       while (t<m){
           t++;
           c = c * (1+t);

       }


        System.out.println("Resultado: " + c);


    }
}
