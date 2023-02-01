package HomeWork16;

public class Task2 {
     public String revStr(String Java){
         StringBuilder rev=new StringBuilder(Java);
        rev.reverse();
        return rev.toString();
    }

    public static void main(String[] args) {
        Task2 rev=new Task2();
        System.out.println(rev.revStr("Java"));
    }

}
