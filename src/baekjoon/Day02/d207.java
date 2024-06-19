package baekjoon.Day02;

import java.util.Arrays;
import java.util.Scanner;

public class d207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] numbers = {a,b,c};
        Arrays.sort(numbers);
        int score = 0;

        if (a==b && b==c){
            score = 10000+a*(1000);
        } else if (a!=b && b!=c && c!=a) {
            score = numbers[2]*100;
        } else if (a==b || b==c || a==c){
            score = 1000+numbers[1]*100;
        }
        System.out.println(score);
//        같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//        같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//        모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.


        sc.close();
    }
}
