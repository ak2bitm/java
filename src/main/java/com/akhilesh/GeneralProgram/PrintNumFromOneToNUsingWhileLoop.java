package main.java.com.akhilesh.GeneralProgram;

import java.util.Scanner;

public class PrintNumFromOneToNUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int num1 = Integer.valueOf(in1);
        int num2 = 1;
        System.out.println("-------Approach One-------");
        /*
        while (num2<=num1){
            System.out.println("Number is :"+num2);
            num2++;
        }*/
        while (num1>=num2){
            System.out.println("Number is :"+num2);
            num2++;
        }
    }

}
