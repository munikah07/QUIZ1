package task_one;

import java.util.Scanner; //importing Scanner

public class Question_2 {
    
    //main function
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Scanner obj
            
        //my variables
        double unit1, unit2, unit3, unit4, unit5, average;
        
            System.out.println("Enter marks of the five units you did on last semester to get the average mark :");
            //inputting the user data
            System.out.println("\nUnit 1 : ");
            unit1 = input.nextDouble();
            System.out.println("Unit 2 : ");
            unit2 = input.nextDouble();
            System.out.println("Unit 3 : ");
            unit3 = input.nextDouble();
            System.out.println("Unit 4 : ");
            unit4 = input.nextDouble();
            System.out.println("Unit 5 : ");
            unit5 = input.nextDouble();

            //getting average mark by calling findAverage() and putting it in a variable
            average = findAverage(unit1, unit2, unit3, unit4, unit5);

            //Outputting the [average]
            System.out.println("\nYou average mark is: " + average);
        }

        //this method is static, and it's return type is a double, it returns the average
    static double findAverage(double unitA, double unitB, double unitC, double unitD, double unitE) {
        //finding the average
        var currentAVG = (unitA + unitB + unitC + unitD + unitE) / 5; 
        var roundAVG = Math.round(currentAVG * 100.0) / 100.0; //rounding the average
        return roundAVG; //This is the return value 
    }
}
