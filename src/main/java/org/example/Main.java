package org.example;

public class Main {
    int Reverse(int num){
        int lastdigit;
        int reverseNumber=0;

        while(num!=0) {
            lastdigit = num % 10;
            reverseNumber = (reverseNumber * 10) + lastdigit;
            num = num / 10;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        Main obj=new Main();
        int Reverse=obj.Reverse(123);
        System.out.println("reverse number is " +Reverse);

    }
}