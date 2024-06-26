package programmers.Day07;

public class d703 {
    public int[] solution(int start_num, int end_num) {
        // 배열의 크기를 올바르게 계산합니다.
        int[] answer = new int[end_num - start_num + 1];

        // start_num부터 end_num까지의 숫자를 배열에 할당합니다.
        for (int i = start_num; i <= end_num; i++) {
            answer[i - start_num] = i;
        }

        return answer;
    }
}
