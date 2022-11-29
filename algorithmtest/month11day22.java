package algorithmtest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class month11day22 {
    public static String solution(int[] arr) throws ParseException {
        String answer = "";

        String date_str = String.format("%d-%d", arr[0], arr[1]);
        SimpleDateFormat transFormat = new SimpleDateFormat("MM-dd"); //입력받은 값이 MM-dd 형식임을 알려줌
        Date date = transFormat.parse(date_str); //string->date 형변환

        Calendar cal1 = Calendar.getInstance(); //Calendar 객체를 불러오기 위해 cal1에 대입
        cal1.setTime(date);
        cal1.add(Calendar.DATE, 98);
        String to = transFormat.format(new Date(cal1.getTimeInMillis()));

        answer = to.replace("-", "월");
        answer += "일";

        return answer;
    }
}