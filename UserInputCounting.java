package userinputcounting;

import java.util.Scanner;

public class UserInputCounting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        String num = sc.nextLine();
        int y = Integer.parseInt(num);
        int x = 1;
        System.out.println(x);
        while(x<y){
            x=x+1;
            System.out.println(x);
        }
        
    }
    
}
