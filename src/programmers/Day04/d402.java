package programmers.Day04;

public class d402 {
    public int solution(int number, int n, int m) {
        return (number%n==0 && number%m==0)? 1: 0;
    }
}
