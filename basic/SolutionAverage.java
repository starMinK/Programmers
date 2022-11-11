package basic;

//프로그래머스 Lv.0 배열의 평균값
public class SolutionAverage {
    public static double solutionAverage(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        answer = answer / (numbers.length);

        return answer;
    }
}
