package HomeWork15;

public class EvenOddNum {
    String evenOdd(int num){
        if (num%2==0){
            return "even";
        }else{
            return "odd";
        }
    }

    public static void main(String[] args) {
        EvenOddNum n=new EvenOddNum();
        System.out.println(n.evenOdd(10));
    }
}
