package HomeWork16;

public class Task3 {
    private String vowels(String str){
        String newStr=str.replaceAll("[^aeiou]","");
        return newStr;
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        String str="Jennifer";
        System.out.println(task3.vowels(str));
    }
}
