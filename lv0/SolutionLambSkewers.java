package lv0;

//프로그래머스 Lv.0 양꼬치
public class SolutionLambSkewers {
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
}
