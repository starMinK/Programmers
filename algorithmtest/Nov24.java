package algorithmtest;

public class Nov24 {
    public static String solution(int[][] arr) {
        String answer = "";
        int[][] addZeroArr;
        addZeroArr = new int[7][7];

        for (int i = 0; i < 7; i++) {
            if (i > 0 && i < 6) {
                addZeroArr[i][0] = 0;
                for (int j = 1; j < 6; j++) {
                    addZeroArr[i][j] = arr[i - 1][j - 1];
                }
                addZeroArr[i][6] = 0;
            }
        }

        //i == 가로줄 j==세로줄
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (addZeroArr[i][j] > addZeroArr[i - 1][j] && addZeroArr[i][j] > addZeroArr[i + 1][j]
                        && addZeroArr[i][j] > addZeroArr[i][j - 1] && addZeroArr[i][j] > addZeroArr[i][j + 1]) {
                    answer += '*';
                } else {
                    answer += addZeroArr[i][j];
                }
            }
            answer += "\n";
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = {{3, 4, 1, 4, 9}, {2, 9, 4, 5, 8}, {9, 0, 8, 2, 1}, {7, 0, 2, 8, 4}, {2, 7, 2, 1, 4}};
        System.out.println(Nov24.solution(arr));
    }
}
