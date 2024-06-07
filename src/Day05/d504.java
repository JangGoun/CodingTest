package Day05;

public class d504 {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int pul = 0;

        for (int a : num_list) {
            mul *= a;
            pul += a;
        }
        answer = (mul < Math.pow(pul, 2)) ? 1 : 0;

        return answer;
    }
}
