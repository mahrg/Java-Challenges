package userinputname;

import java.util.Scanner;

public class UserInputName {

    public static void main(String[] args) {
        
        System.out.println("What is your name?");
        Scanner an = new Scanner(System.in);
        String answer = an.nextLine();
        System.out.println("Hello, "+answer);
    }
    
}
