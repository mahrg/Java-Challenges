package pkg100;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int num1 = Integer.parseInt(num);
        if(num1>100){
            System.out.println("Larger than 100");
        }else{
            System.out.println("Less than 100");
        }
    }
    
}
