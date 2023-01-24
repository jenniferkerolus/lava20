package homeWork12;

public class Task1 {
    public static void main(String[] args) {
        String str=new String("HelloWorld!");
        System.out.println("String Length:"+str.length());
        boolean empty=str.isEmpty();
        System.out.println(empty);
        for (int i = 0; i <=str.length(); i++) {
            if (i % 2 != 0 && i >= 3) {

                System.out.println(str.charAt(5));
                break;
            }
            
        }


    }
}
