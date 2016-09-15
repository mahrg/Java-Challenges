package distancetravelled;

import java.util.Scanner;

public class DistanceTravelled {

    public static void main(String[] args) {
        
        System.out.println("Please enter the Speed of the object(in m/s):");
        Scanner sc = new Scanner(System.in);
        String speed = sc.nextLine();
        int sp = Integer.parseInt(speed);
        System.out.println("Please enter the Time of the object(in seconds):");
        String time = sc.nextLine();
        int ti = Integer.parseInt(time);
        
        System.out.println("The distance travelled by your object is: "+sp*ti);
    
    }
    
}
