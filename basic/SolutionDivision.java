package basic;

//Programmers Lv.0 두 수의 나눗셈
public class SolutionDivision {
    public static int solutionDivision(int num1, int num2) {
        double doubleNum1 = num1;
        double doubleNum2 = num2;
        double sol = doubleNum1 / doubleNum2 * 1000;

        System.out.println(sol);

        int answer = 0;
        answer = (int) sol;
        return answer;
    }
}
