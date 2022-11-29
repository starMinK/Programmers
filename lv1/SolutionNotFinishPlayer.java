package lv1;

public class SolutionNotFinishPlayer {
    //participant 참가 선수, completion 완주선수, answer 남은 한명의 완주하지 못한 선수
    public static String solutionNotFinishPlayer(String[] participant, String[] completion) {
        String answer = "";
        int check = 0;

        for(int i = 0; i < participant.length; i++){
            for (int j = 0; j < completion.length; j++){
                if(participant[i] != completion[j]){
                    check++;
                }
                if(check == participant.length) {
                    answer = participant[i];
                }
            }
        }
        return answer;
    }
}
