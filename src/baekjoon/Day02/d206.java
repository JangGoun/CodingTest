package baekjoon.Day02;

import java.util.Scanner;

public class d206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();

        int totalMin = min+time;
        int totalHour = hour;

        if (0<=hour && hour<=23 && 0<=min && min<=59 && 0<=time && time<=1000){
            if (totalMin>59){
                totalHour += totalMin/60;
                if (totalHour>23){
                    totalHour=totalHour%24;
                }
                totalMin = totalMin%60;
            }

            System.out.println(totalHour+" "+totalMin);
        }


        sc.close();

    }
}
