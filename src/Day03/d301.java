package Day03;

public class d301 {
    public String solution(String str1, String str2) {
        String answer = "";

        String[] list1 = str1.split("");
        String[] list2 = str2.split("");

        for (int i = 0; i < str1.length(); i++) {
            answer += list1[i]+list2[i];
        }

        return answer;
    }
}
