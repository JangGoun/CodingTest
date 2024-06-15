package programmers.Day06;

public class d601 {
    public int[] solution(int[] num_list) {
        // 새 배열 생성
        int[] answer = new int[num_list.length+1];
        // 새로 받을 값 생성
        int newNum = 0;

        // 새 배열에 원래 배열값 넣기
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        // 원래 배열에 마지막값과 그 전 값 구하기
        int lastNum = num_list[num_list.length-1];
        int beforeNum = num_list[num_list.length-2];

        // 새 값 구하기
        newNum = lastNum>beforeNum ? lastNum-beforeNum: lastNum*2;

        // 새 배열에 새 값 추가
        answer[num_list.length] = newNum;

        return answer;
    }
}
