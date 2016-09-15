package rectanglearea;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        System.out.println("Please enter the height of the rectangle:");
        Scanner sc = new Scanner(System.in);
        String height = sc.nextLine();
        int he = Integer.parseInt(height);
        System.out.println("Please enter the length of the rectangle:");
        String length = sc.nextLine();
        int le = Integer.parseInt(length);
        System.out.println("The area of the rectangle is: "+le*he);
    }
    
}
