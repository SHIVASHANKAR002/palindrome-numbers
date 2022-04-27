package com.packages;

import java.util.Scanner;

class DigitsOpr {
    private int num;

    public void getNum(int x) {
        num = x;
    }

    public boolean isPalindrome() {
        int n, sum, d;
        n = num;
        sum = 0;
        while (n > 0) {
            d = n % 10;
            sum = (sum * 10) + d;
            n /= 10;
        }
        if (sum == num){
            return true;
        }
        else {
            return false;
        }
    }
}

public class palindrome {
    public static void main(String[] s) {
        DigitsOpr dig = new DigitsOpr();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        dig.getNum(n);
        if (dig.isPalindrome()) {
            System.out.println(n + " is palindrome");
        } else {
            System.out.println(n + " is not palindrome");
        }

    }
}

