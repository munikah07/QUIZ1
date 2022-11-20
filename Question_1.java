package task_one;

import java.util.Scanner;

public class Question_1 {

    // program starting point
    public static void main(String[] args) {

        // Creating scanner object
        Scanner input = new Scanner(System.in);
        
        //My variables
        String userSirName, isOddorEven;
        int userAge, userSirNameSize;
        
        

        //get data from the user
        System.out.println("Please enter your sir name :");
        userSirName = input.nextLine();
        System.out.println("PLease enter your age :");
        userAge = input.nextInt();

        
        //do main tasks here
        //task one:
        //getting the number of letters in the sir name
        userSirNameSize = userSirName.length(); 
        //task two:
        //if userAge is even or odd
        if (userAge % 2 == 0) {
            isOddorEven = "even";
        } else {
            isOddorEven = "odd";
        }
        //End of tasks

        //Showing output to the user
        System.out.println("The number of characters in your sir name is : " + userSirNameSize);
        System.out.println("Your current userAge is an " + isOddorEven + " number.");
    }
}
