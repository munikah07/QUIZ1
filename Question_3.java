package task_one;

import java.util.Scanner; //Sannner import

public class Question_3 {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        //getting input from the console
        System.out.println("This program checks if numbers are divisibile by zero to 9. Enter any number :");
        int numberToTest;
        numberToTest = input.nextInt();

        //using methods in main activity
        testZero(numberToTest);
        testOne(numberToTest);
        testTwo(numberToTest);
        testThree(numberToTest);
        testFour(numberToTest);
        testFive(numberToTest);
        testSix(numberToTest);
        testSeven(numberToTest);
        testEight(numberToTest);
        testNine(numberToTest);
    }

    //test 0
    static void testZero(int numToTest) {
        System.out.println(numToTest + " can't be divisible by 0.");
    }

    //test 1
    static void testOne(int numToTest) {
        System.out.println(numToTest + " is divisible by 1.");
    }

    //test 2
    static void testTwo(int numToTest) {
        if (numToTest % 2 == 0) {
            System.out.println(numToTest + " is divisible by 2.");
        } else {
            System.out.println(numToTest + " is not divisible by 2.");
        }
    }

    //test 3
    static void testThree(int numToTest) {
        if ((numToTest % 3) == 0) {
            System.out.println(numToTest + " is divisible by 3");
        } else {
            System.out.println(numToTest + " is not divisible by 3");
        }
    }

    //test 4
    static void testFour(int numToTest) {
        if ((numToTest % 4) == 0) {
            System.out.println(numToTest + " is divisible by 4");
        } else {
            System.out.println(numToTest + " is not divisible by 4");
        }
    }

    //test 5
    static void testFive(int numToTest) {
    if ((numToTest % 5) == 0) {
            System.out.println(numToTest + " is divisible by 5");
        } else {
            System.out.println(numToTest + " is not divisible by 5");
        }
    }

    //test 6
    static void testSix(int numToTest) {
        if ((numToTest % 6) == 0) {
            System.out.println(numToTest + " is divisible by 6");
        } else {
            System.out.println(numToTest + " is not divisible by 6");
        }
    }

    //test 7
    static void testSeven(int numToTest) {
        if ((numToTest % 7) == 0) {
            System.out.println(numToTest + " is divisible by 7");
        } else {
            System.out.println(numToTest + " is not divisible by 7");
        }
    }

    //test 8
    static void testEight(int numToTest) {
        if ((numToTest % 8) == 0) {
            System.out.println(numToTest + " is divisible by 8");
        } else {
            System.out.println(numToTest + " is not divisible by 8");
        }
    }

    //test 9
    static void testNine(int numToTest) {
        if ((numToTest % 9) == 0) {
            System.out.println(numToTest + " is divisible by 9");
        } else {
            System.out.println(numToTest + " is not divisible by 9");
        }
    }
}
