package algorithmtest;

import java.util.*;
import java.util.stream.Collectors;

public class kakao1 {
    public static int solution0(int[][] flowers) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < flowers.length; i++) {
            for (int j = 0; j < flowers[i][1] - flowers[i][0]; j++) {
                list.add(flowers[i][0] + j);
            }
        }

        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        answer = newList.size();

        return answer;
    }

    public static int solution1(String[] id_list, int k) {
        int answer = 0;
        int[] count = new int[id_list.length];
        String allCostomers = "";

        for (int i = 0; i < id_list.length; i++) {
            Set<String> set = new HashSet<>(Arrays.asList(id_list[i].split(" ")));
            allCostomers += set;
            allCostomers += " ";
            count[i] = set.size();
        }
        allCostomers = allCostomers.replaceAll(",", "").replaceAll("\\[", "")
                .replaceAll("\\]", "");

        List<String> list = Arrays.asList(allCostomers.split(""));

        Set<String> set = new HashSet<String>(list);
        for (String str : set) {
            if (Collections.frequency(list, str) > k) {
                System.out.println(str + " : " + k);
                answer += k;
            } else {
                System.out.println(str + " : " + Collections.frequency(list, str));
                answer += Collections.frequency(list, str);
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        String[] answer0 = {"JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY", "ELLE MAY", "ELLY ELLY ELLY", "MAY"};
        String[] answer1 = {"A B C D", "A D", "A B D", "B D"};

        System.out.println(kakao1.solution1(answer0, 3));
    }
}
