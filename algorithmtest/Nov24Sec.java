package algorithmtest;

public class Nov24Sec {
    public static String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                answer += " ";
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                answer += "*";
            }
            answer += "\n";
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(Nov24Sec.solution(n));
    }
}
