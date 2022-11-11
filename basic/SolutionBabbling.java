package basic;

//Programmers Lv.0 옹알이
public class SolutionBabbling {
    public static int solutionBabbling(String[] babbling) {
        int answer = 0;
        for (int i=0; i < babbling.length; i++) {
            int stringLength = babbling[i].length();
            if (babbling[i].contains("aya")) {
                stringLength -=3;
            }
            if (babbling[i].contains("ye")){
                stringLength -=2;
            }
            if (babbling[i].contains("woo")){
                stringLength -=3;
            }
            if (babbling[i].contains("ma")){
                stringLength -=2;
            }
            answer = (stringLength == 0) ? answer + 1 : answer;
        }
        return answer;
    }
}
