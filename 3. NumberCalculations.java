package numbercalculations;

import java.util.Scanner;

public class NumberCalculations {

    public static void main(String[] args) {
        System.out.println("What is your first number?");
        Scanner an = new Scanner(System.in);
        String fn = an.nextLine();
        System.out.println("What is your second number?");
        String sn = an.nextLine();
        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        System.out.println(num1+" divided "+num2+" equals "+num1/num2);
    }
    
}
