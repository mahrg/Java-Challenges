package testscore;

import java.util.Scanner;

public class TestScore {

    public static void main(String[] args) {
        System.out.println("What is your Test Score?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        int grade = Integer.parseInt(answer);
        
        if (grade>20){
            System.out.println("You have achieved an A.");
        }else if(grade>10){
            System.out.println("You have achieved a C.");
        }else if(10>grade) {
            System.out.println("You have failed the test.");
        }
            
    }
    
}


//int score = 25

// if score > 20
    // do this
// else if score > 10
    // do this
//else 
    // fail

