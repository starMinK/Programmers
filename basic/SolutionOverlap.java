package basic;//Programmers Lv.0 중복된 숫자 개수
import java.util.Arrays;

public class SolutionOverlap {
    public static int solutionOverlap(int[] array, int n) {
        int answer = 0;
        for (int i=0; i < array.length; i++) {
            if (Arrays.asList(array[i]).indexOf(n) >= 0){
                answer++;
            }
        }
        return answer;
    }
}
