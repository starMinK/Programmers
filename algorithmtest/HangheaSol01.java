package algorithmtest;

public class HangheaSol01 {
    public static void main(String arg[]){
        int var1=5;
        double var2=2.0;
        //앞서 말했듯 피연산자 중 하나는 실수 타입이면 되니까 변수 초기화를 할 때 double 타입을 사용해줘도 좋다.
        double var3=(double)var1/var2; //double var3 = 2.5
        int var4=(int)(var3*var2); //int var4 = (int)(2.5*2)
        System.out.println(var4); //var4 = 5
    }
}
