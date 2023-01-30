package HomeWork15;

public class LargeNum {

    int largeNumber(int a,int b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        LargeNum n=new LargeNum();
        System.out.println(n.largeNumber(10,20));
    }
}
