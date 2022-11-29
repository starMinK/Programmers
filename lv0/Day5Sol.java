package lv0;

import java.util.ArrayList;

public class Day5Sol {
    public static ArrayList solution1(int[] num_list) {
        ArrayList answer = new ArrayList();
        for(int i = num_list.length-1; i >= 0; i--){
            answer.add(num_list[i]);
        }
        return answer;
    }

    public static int[] solution2(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                odd++;
            }else{
                even++;
            }
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }

    public static int solution3(int n) {
        int answer = 0;
        double result = (double) n / 7;

        if(result - ((int) result) > 0){
            answer = (int) result + 1;
        }else {
            answer = (int) result;
        }
        return answer;
    }

    public static void main (String[] args){
        int[] arr = {1, 3, 4, 5};
        int n = 15;
        System.out.println(solution3(n));
    }
}
