package Day08;

import java.util.Arrays;

public class d802 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        // 배열로 주사위 값을 저장
        int[] dice = {a,b,c,d};

        // 주사위 값을 오름차순 정렬(작은 값부터)
        Arrays.sort(dice);

        if (dice[0]==dice[3]){
            // 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
            answer = 1111*dice[0];
        }else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            // 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)의 제곱 점을 얻습니다.
            answer = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
            // (dice[0] + dice[3] - dice[1]) 0자리나 3자리에 q가 있고 무조건 p인 1자리를 빼줌. (p+q-p)
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            // 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
            answer = (dice[0] + dice[3]) * (dice[3] - dice[0]);
            // dice[3]는 언제나 dice[0] 보다 크기때문에 음수가 나오지 않는다. 절대값 관련 함수가 필요없음
        } else if (dice[0] == dice[1]) {
            // 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
            answer = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            answer = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            answer = dice[0] * dice[1];
        }  else {
            // 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
            answer = dice[0];
        }

        return answer;
    }
}
