package basic;

//프로그래머스 Lv.0 각도기
public class SolutionAngle {
    public static int solutionAngle(int angle) {
        int answer = 0;
        if (0 < angle && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else {
            answer = 4;
        }
        return answer;
    }
}
