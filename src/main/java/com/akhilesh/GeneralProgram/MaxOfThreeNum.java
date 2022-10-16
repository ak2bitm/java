package main.java.com.akhilesh.GeneralProgram;

import java.util.Scanner;

public class MaxOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int in3 = sc.nextInt();
        int num1 = Integer.valueOf(in1);
        int num2 = Integer.valueOf(in2);
        int num3 = Integer.valueOf(in3);
        if(num1>num2 && num1>num3){
            System.out.println(num1+" is max number.");
        }else if (num2>num3){
            System.out.println(num2+" is max number.");
        }else {
            System.out.println(num3+" is max number");
        }
    }

}
