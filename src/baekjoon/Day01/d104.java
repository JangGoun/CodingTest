package baekjoon.Day01;

import java.util.Scanner;

public class d104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (0<a && b<10){
            System.out.println(a*b);
        }

        sc.close();
    }
}
