package Homework17;

public class Book {
    String subject;
    String name;
    int year;
    Book(String bSubject,String bName,int bYear){
        subject=bSubject;
        name=bName;
        year=bYear;
    }
    public Book(String bName,int bYear,String bSubject){
        name=bName;
        year=bYear;
        subject=bSubject;
    }
    void printInfo(){
        System.out.println(subject+" name "+name+" year "+year);
    }

    public static void main(String[] args) {
        Book b=new Book("Story","Aligator",2018);
        b.printInfo();
        Book b1=new Book("Poetry","Day",2020);
        b1.printInfo();
    }


}
