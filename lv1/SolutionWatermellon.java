package lv1;

public class SolutionWatermellon {
    public static String solutionWatermellon(int n) {
        String answer = "";
        if(n % 2 == 0) {
            for(int i = 0; i < n/2; i++){
                answer+="수박";
            }
        }else if(n % 2 == 1){
            if (n == 1){
                answer = "수";
            }else{
                for(int i = 0; i < n/2; i++){
                    answer+="수박";
                }
                answer += "수";
            }
        }
        return answer;
    }
}
