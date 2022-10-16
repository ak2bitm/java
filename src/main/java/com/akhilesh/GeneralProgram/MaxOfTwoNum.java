package main.java.com.akhilesh.GeneralProgram;

import java.util.Scanner;

public class MaxOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int num1 = Integer.valueOf(in1);
        int num2 = Integer.valueOf(in2);
        if(num1>num2){
            System.out.println(num1+" is max number.");
        }else {
            System.out.println(num2+" is max number.");
        }
    }

}
