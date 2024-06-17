package baekjoon.Day01;

import java.util.Scanner;

public class d109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (2<= a && b<=10000 && c<= 10000){
            System.out.println((a+b)%c);
            System.out.println(((a%c)+(b%c))%c);
            System.out.println((a*b)%c);
            System.out.println(((a%c)*(b%c))%c);

        }


        sc.close();
    }
}
