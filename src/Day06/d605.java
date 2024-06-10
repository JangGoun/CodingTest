package Day06;

import java.util.ArrayList;

public class d605 {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int[] query: queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            int min = Integer.MAX_VALUE;// 기본값으로 최대값 넣어놓고 비교

            for (int i = s; i <= e; i++) {
                if (arr[i]>k && arr[i]<min){
                    // 최소값보다 작으면 최소값 변경
                    min = arr[i];
                }
            }

            list.add(min==Integer.MAX_VALUE ? -1: min);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
