package programmers.Day06;

public class d604 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int temp = 0;


        for (int i = 0; i < queries.length; i++) {

            temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]]=temp;

        }


        answer = arr;

        return answer;
    }
}