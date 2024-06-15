package programmers.Day03;

public class d305 {
    public int solution(int a, int b) {
        int answer = 0;
        int mul = 0;

        String plus = String.valueOf(a)+String.valueOf(b);

        mul = 2*a*b;

        return Math.max(Integer.parseInt(plus), mul) ;
    }
}
