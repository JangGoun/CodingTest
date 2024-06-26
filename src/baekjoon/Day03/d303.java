package baekjoon.Day03;

import java.util.Scanner;

public class d303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number=0;

        if (n>=1 && n<=10000){
            for (int i = 1; i <= n; i++) {
                number += i;
            }
            System.out.println(number);
        }

        sc.close();
    }
}
