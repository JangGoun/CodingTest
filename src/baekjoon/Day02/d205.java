package baekjoon.Day02;

import java.util.Scanner;

public class d205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (0<=hour && hour<= 23 && 0<=min && min<=59){
            if (min-45<0){
                hour--;
                min = 60 + min - 45;
                if (hour < 0) { // 시간이 0보다 작아지면 23으로 설정
                    hour = 23;
                }
            } else {
                min = min-45;
            }

            System.out.println(hour +" "+ min);
        }

        sc.close();
    }
}
