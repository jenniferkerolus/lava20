package HomeWork15;

public class HelloStr {
    String word(String country){
        switch (country){
            case "USA":
                return "Hello";
            case "German":
                return "Hallo";
            case "Mexico":
                return "Hola";
            default:
                return "Invaild";
        }

    }

    public static void main(String[] args) {
        HelloStr w=new HelloStr();
        System.out.println(w.word("USA"));
    }
}
