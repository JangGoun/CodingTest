package programmers.Day08;

public class d803 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for (int i = 0; i < index_list.length; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        return answer;

//        StringBuilder sb = new StringBuilder();
//
//        for (int idx : index_list)
//            sb.append(my_string.charAt(idx));
//
//        return sb.toString();
    }
}
