package Day01;

import java.util.Scanner;

public class d104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String output="";

        char temp = ' ';    // char 홀따옴표 공백으로 초기화

        for (int i=0; i<a.length(); i++){
            temp = a.charAt(i); // 문자열 값을 문자로 하나씩 가져옴

            if ((65<=temp) && (temp<=90) && a.length()<=20){
                output += a.valueOf(temp).toLowerCase();
            } else if ((97<=temp) && (temp<=122) && a.length()<=20){
                output += a.valueOf(temp).toUpperCase();
            }
        }
        System.out.println(output);
    }
}
