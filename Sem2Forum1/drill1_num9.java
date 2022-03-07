import java.util.Scanner;

public class drills1_9 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      double celsiusInput;
      double fahrenheightOutput;

      System.out.println("Please input the temperature in Celsius: ");
      celsiusInput = input.nextDouble();
      
      fahrenheightOutput = ((9 * celsiusInput)/5) + 32;

      System.out.println(fahrenheightOutput + "is the converted value.");
    }
}