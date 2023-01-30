package HomeWork15;

public class PrimeNum {
    String prime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return "Prime";
            } else {

            }
        }
                return "Not prime";
            }

    public static void main(String[] args) {
        PrimeNum n=new PrimeNum();
        System.out.println(n.prime(30));
    }

        }



