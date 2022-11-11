public class Solution {
    //프로그래머스 Lv.0 각도기
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

    //프로그래머스 Lv.0 배열의 평균값
    public static double solutionAverage(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        answer = answer / (numbers.length);

        return answer;
    }

    //프로그래머스 Lv.0 양꼬치
    public static int solutionLambSkewers(int n, int k) {
        int answer = 0;

        int service = n / 10;

        if (n >= 10) {
            k -= service;
        }
        //양꼬치 n 12000원 / 음료 k 2000원
        answer = n*12000 + k*2000;

        return answer;
    }

    //Programmers Lv.0 두 수의 나눗셈
    public static int solutionDivision(int num1, int num2) {
        double doubleNum1 = num1;
        double doubleNum2 = num2;
        double sol = doubleNum1 / doubleNum2 * 1000;

        System.out.println(sol);

        int answer = 0;
        answer = (int) sol;
        return answer;
    }

    //Programmers Lv.0 머쓱이보다 키 큰 사람
    public int solutionShiny(int[] array, int height) {
        int answer = 0;
        return answer;
    }


    public static void main(String[] args) {
        /*
        int answer = solutionAngle(90);
        System.out.println(answer);
         */

        /*
        double answer = solutionAverage(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99});
        System.out.println(answer);
        */

        /*
        int answer = solutionLambSkewers(64, 6);
        System.out.println(answer);
        */

        /*
        int answer = solutionDivision(1, 16);
        System.out.println(answer);
        */

    }
}
