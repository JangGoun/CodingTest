package baekjoon.Day01;

import java.util.Scanner;

public class d107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        if (id.length()<50 && id.matches("[a-z]+")){
            System.out.println(id+"??!");
        }

        sc.close();
    }
}
