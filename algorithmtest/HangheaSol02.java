package algorithmtest;

public class HangheaSol02 {
    public static void main(String[] arg){
        //1. Math.random() 메소드는 0<= x < 1 사이의 값을 출력한다.
        //2. 주사위는 6면이므로 정수 1~6을 출력하기 위해 *6을 해준다. -> 0 <= x < 6
        //3. 1이상 7미만의 값을 가지도록 +1을 해준다. -> 1 <= x < 7
        //4. 주사위의 눈은 정수여야 하므로 double 타입의 Math.rondom() 메소드를 int 타입으로 강제 변환해준다.
        int num1 = (int) (Math.random()*6)+1;
        int num2 = (int) (Math.random()*6)+1;

        System.out.println("시작!");
        while (num1 + num2 != 5) {
            System.out.println(num1 + num2);
        }
        System.out.println("끝!");
    }
}
