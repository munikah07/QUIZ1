package task_one;

//importing classes for generating my list
import java.util.List;              //List
import java.util.stream.Collectors; //Collectors
import java.util.stream.IntStream;  //IntStream

public class Question_4 {

    public static void main(String[] args) {
        
    
        List<Integer> myList; //this list will store numbers from 71 to 150
        myList = IntStream.range(71, 150).boxed().collect(Collectors.toList());
        
        myList.add(150); //adding 150 to the list

        //Used modulus to determine the multiples of 2, 3 and 7
        
        System.out.println("\n2 has the following multiples:");
        //Getting the multiples of 2:
        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                System.out.println(myList.get(i));
            }
            
            if (i == 150-71) {
                break; //braek loop to prevent an exception
            } 
        }
        System.out.println("\n");

        System.out.println("3 has the following multiples:");
        //these are the multiples of 3
        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 3 == 0) {
                System.out.println(myList.get(i));
            }
            
            if (i == 150-71) {
                break; //braek loop to prevent an exception
            } 
        }
        System.out.println("\n"); //my empty line
        
        //Multiples of 7:
        System.out.println("7  has the following multiples:");
        //these are the multiples of 7
        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 7 == 0) {
                System.out.println(myList.get(i));
            }
            
            if (i == 150-71) {
                break; //braek loop to prevent an exception
            } 
        }
    }
}
