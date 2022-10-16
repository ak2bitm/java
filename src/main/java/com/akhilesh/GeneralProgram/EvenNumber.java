package main.java.com.akhilesh.GeneralProgram;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner =   new Scanner(System.in);
        int in1 = scanner.nextInt();
        if (in1 % 2 ==0)
            System.out.println(in1+" is even number.");
        else
            System.out.println(in1+" is not a Even number.");
    }

}
