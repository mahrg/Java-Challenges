package sums;

import java.util.Scanner;

public class Sums {

    public static void main(String[] args) {
        System.out.println("Please enter your first number:");
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        int fn = Integer.parseInt(first);
        System.out.println("Please enter your second number:");
        String second = sc.nextLine();
        int sn = Integer.parseInt(second);
        System.out.println("What calculation would you like to do?");
        System.out.println("1. Addition, 2. Subtraction, 3. Multiplication or 4. Division");
        int cal = sc.nextInt();
        if( cal == 1 ){
            System.out.println(fn+sn);
        }else if( cal == 2){
            System.out.println(fn-sn);
        }else if( cal == 3 ){
            System.out.println(fn*sn);
        }else if( cal == 4 ){
            System.out.println(fn/sn);
        }else {
            System.out.println("Please enter a valid input.");
        }
        
    }
}