package baekjoon.Day01;

import java.util.Scanner;

public class d111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long c = sc.nextLong();

        Long sum = a+b+c;

        System.out.println(sum);

        sc.close();
    }
}
