package programmers.Day02;

public class d205 {
    public String solution(String my_string, String overwrite_string, int s) {

        String answer = "";
        int behind = my_string.length()-s-overwrite_string.length();

        String first = my_string.substring(0,s);
        String second = my_string.replace(my_string, overwrite_string);
        String third = my_string.substring(s+overwrite_string.length());

        answer = first+second+third;

        return answer;

    }
}
