import java.util.Scanner;

public class PrintArray {
    public static void PrintArr(String[] args) {
        //creating a scanner object for input and boolean to be used for a loop
        Scanner numInput = new Scanner(System.in);
        boolean bool = true;
        //Prompting user to input array size
        while (bool) {
            System.out.print("Enter the amount of items for the array(must be a positive, non-zero integer): ");
            int NUM_ITEMS = numInput.nextInt();
            //Error checking to make sure that the integer is non-zero and a positive number
            if (NUM_ITEMS>0) {
                bool = false;
            } else {
                System.out.print("Incorrect input! Please enter a non-zero, positive integer.");
            }
        }
        //creating the array
        int[] numArray = new int[NUM_ITEMS];
        //prompting user to input values to be added to the array
        System.out.print("Enter each value of the items(Have a space in between each integer): ");
        //storing the user's input in the items array
        for (int i=0; i<NUM_ITEMS.length; i++){
            numArray[i] = numInput.nextInt();
        }
        
        System.out.println("The contents inside the array are: ");
        System.out.print('[');
       //for loop to index and print the objects inside the array
        for(int i = 0; i < numArray.length; i++){
            if (i != numArray.length - 1){
                System.out.print(numArray[i] + " , ");
            } else {
                System.out.print(numArray[i] + "]");
            }
        }
    }
    public static void main(String[] args){
        PrintArr();
    }
}