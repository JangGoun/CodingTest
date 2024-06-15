package programmers.Day05;

public class d501 {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        // 코드를 잘라서 배열에 넣음
        String[] array = code.split("");

        for (int i = 0; i < array.length; i++) {

            if (mode==0){
                if (array[i].equals("1")){mode=1;}  // 배열에 1이 나오면 mode를 1로 변경
                answer = (!array[i].equals("1"))&&(i%2==0) ? answer.concat(array[i]):answer;
            } else if (mode==1) {
                if (array[i].equals("1")){mode=0;} // 배열에 1이 나오면 mode를 0로 변경
                answer = (!array[i].equals("1"))&&(i%2==1) ? answer.concat(array[i]):answer;

            }
        }


        return answer=="" ? "EMPTY": answer;
    }
}
