package programmers.Day05;

public class d505 {
    public int solution(int[] num_list) {
        int answer = 0;
        String list1= "";
        String list2 = "";

        for (int a : num_list){
            if (a%2==0){
                // 방법1 concat 사용해서 문자열 붙이기
                list1=list1.concat(Integer.toString(a));
            } else{
                // 방법2 연산자로 문자열 붙이기(사용 가능)
                list2+=Integer.toString(a);
            }
        }
        answer = Integer.parseInt(list1) + Integer.parseInt(list2);


        return answer;
    }
}
