package class5;

import java.util.Scanner;

public class HomeWork06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        if (a>b){
            if (a>c) {
                System.out.println(a + " is the largest number");
            }else {
                System.out.println(c + " is the largest number");
            }
            }else if (b>c) {
            System.out.println(b + " is the largest number");
        }else{
            System.out.println(c+" is the largest number ");


            }
        }
    }
