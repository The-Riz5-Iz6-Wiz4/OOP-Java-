import java.util.Scanner;

public class drill1_10 {
    public static double average(double a, double b, double c){
        return (a + b + c)/3;
    }
    public static double variance(double a, double b, double c){
        double mean = average(a,b,c)/3;
        return (Math.pow((a - mean), 2) + Math.pow((b - mean), 2) + Math.pow((c - mean), 2))/3;
    }
    public static double standardDeviation(double a, double b, double c){
        return Math.sqrt(variance(a,b,c));
    }
    public static void main(String[] args){
        Scanner aInput = new Scanner(System.in);
        Scanner bInput = new Scanner(System.in);
        Scanner cInput = new Scanner(System.in);
        Scanner choiceInput = new Scanner(System.in);
        
        System.out.println("Enter the values a, b and c in order to be used in calculations:");
        double a = aInput.nextDouble();
        double b = bInput.nextDouble();
        double c = cInput.nextDouble();

        while(true) {
            System.out.println("Please input the number of what you'd like to calculate: ");
            System.out.println("1. Get average\n" + "2. Get variance\n" + "3. Get standard deviation\n");
            int choice = choiceInput.nextInt();
            if (choice == 1){
                System.out.println("The mean/average is" + average(a, b, c));
                break;
            } else if (choice == 2){
                System.out.println("The variance is" + variance(a, b, c));
            } else if (choice == 3){
                System.out.println("The standard deviation is" + standardDeviation(a, b, c));
            }

        }

    }
}