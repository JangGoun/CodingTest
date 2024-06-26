package baekjoon.Day03;

import java.util.Scanner;

public class d305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N/4;

        if (num>0){
            for (int i = 0; i < num; i++) {
                System.out.print("long ");
            }
            System.out.print("int");
        }


        sc.close();
    }
}
