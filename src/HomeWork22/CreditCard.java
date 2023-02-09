package HomeWork22;

public class CreditCard {
    int balance=10000;
    double interest=2.5;
    void calculateInterest(){
        System.out.println(balance*interest);
    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    double interest=2.6;
    @Override
    void calculateInterest() {
        System.out.println(balance*interest);
    }
}
class CreditTester{
    public static void main(String[] args) {
        CreditCard c=new CreditCard();
        c.calculateInterest();
        Visa v=new Visa();
        v.calculateInterest();
        AX interest=new AX();
        interest.calculateInterest();
    }
}