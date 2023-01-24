package homeWork12;

public class Task2 {
    public static void main(String[] args) {
        String day=new String("Sunday");
        String reverse="";
        for (int i = 0; i < day.length(); i++) {
            reverse=day.charAt(i)+reverse;
        }
        System.out.println(reverse);
    }
}
