package userinputcountry;

import java.util.Scanner;

public class UserInputCountry {

    public static void main(String[] args) {
        
        System.out.println("Enter a country:");
        Scanner an = new Scanner(System.in);
        String answer = an.nextLine();
        System.out.println("Enter the population:");
        String answer2 = an.nextLine();
        System.out.println(answer+" has a population of "+answer2);
    }
    
}
