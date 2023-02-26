package HomeWork29;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String, Integer> student = new HashMap<>();
        student.put("Daniel", 1234);
        student.put("Leo", 3456);
        student.put("Cris", 7654);
        student.put("Ella", 8776);

        System.out.println(student.keySet());
        for (Object s : student.keySet()) {
            System.out.println(student.get(s));
        }
    }
}

