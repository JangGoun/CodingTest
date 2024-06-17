package baekjoon.Day01;

import java.util.Scanner;

public class d110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String input = sc.next();

        String[] number = input.split("");


        // 3 a*b의 1자리
        System.out.println(a*Integer.parseInt(number[2]));
        // 4 a*b의 2자리
        System.out.println(a*Integer.parseInt(number[1]));
        // 5 a*b의 3자리
        System.out.println(a*Integer.parseInt(number[0]));
        // 6
        System.out.println(a*Integer.parseInt(input));


        sc.close();
    }
}
