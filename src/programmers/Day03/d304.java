package programmers.Day03;

public class d304 {
    public int solution(int a, int b) {
        int answer = 0;

        String plus1 = "";
        String plus2 = "";
        plus1 = String.valueOf(a)+String.valueOf(b);
        plus2 = String.valueOf(b)+String.valueOf(a);

        if (Integer.parseInt(plus1)>Integer.parseInt(plus2))
        {
            return Integer.parseInt(plus1);
        } else if (Integer.parseInt(plus1)<Integer.parseInt(plus2)) {
            return Integer.parseInt(plus2);
        } else {
            return Integer.parseInt(plus1);
        }
    }
}
