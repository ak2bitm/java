package main.java.com.akhilesh.GeneralProgram;

import java.util.Scanner;

public class PrintNumFromMToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int num1 = Integer.valueOf(in1);
        int num2 = Integer.valueOf(in2);
        System.out.println("-------Approach One-------");
        /*
        for (int i=num1; i<=num2; i++){
            System.out.println("Number is :"+i);
        }
        */
        while (num1<=num2){
            System.out.println("Number is :"+num1);
            num1++;
        }
    }

}
