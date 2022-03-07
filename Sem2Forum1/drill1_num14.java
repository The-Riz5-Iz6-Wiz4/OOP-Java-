import java.util.Scanner;

public class drill1_14{
    public static void main(String[] args){
        Scanner timeInput = new Scanner(System.in);

        System.out.println("Please input a number in seconds. The input should be an integer: ");
        int secTime = timeInput.nextInt();

        int Hour = secTime/3600;
        int Minute = (secTime%3600)/60;
        int Second = secTime%60;

        System.out.println("The input when formatted properly is\n");
        System.out.println(Hour + " hours " + Minute + " minutes " + Second + " seconds ");
    }
}