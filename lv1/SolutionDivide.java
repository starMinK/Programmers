package lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionDivide {
    public static List<Integer> solutionDivide(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            double isCorrect = (double) arr[i] / divisor;
            if (isCorrect-(int)isCorrect == 0){
                answer.add(arr[i]);
            }
        }

        if (answer.isEmpty()){
            answer.add(-1);
        }
        Collections.sort(answer);
        return answer;
    }
}
