package HomeWork15;

public class GetGrade {
    String grade(int score){
        switch (score){
            case 90:
                return "A";
            case 80:
                return "B";
            case 70:
                return "C";
            case 50:
                return "D";
            default:
                return "F";


        }
    }

    public static void main(String[] args) {
        GetGrade s=new GetGrade();
        System.out.println(s.grade(90));
    }

}
