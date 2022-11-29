package lv0;

//Programmers Lv.0 분수의 덧셈
public class SolutionAddFractions {
    public static int[] solutionAddFractions(int denum1, int num1, int denum2, int num2) {
        int[] answer = {};
        //통분
        for (int i=2; num1 == num2; i++){
            if (num1 % num2 == 0) {
                if(num2*i==num1){
                    num2*=i;
                    denum2*=i;
                    break;
                }
            }
        }
        int num3 = num1 + num2;
        for(int i =0; (num3/(double) denum1) % 2 == 0 || (num3/(double) denum1) % 3 == 0 || (num3/(double) denum1) % 5 == 0; i++) {
            
        }


        if (denum2 % denum1 == 0) {

        }
        return answer;
    }
}
