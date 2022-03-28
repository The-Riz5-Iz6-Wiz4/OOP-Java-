import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class PrintStudent {
    public static void PrintGrade(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int numStu = input.nextInt();
        int[] grades = new int[numStu];
        for (int i = 0; i<grades.length; i++){
            System.out.printf("Enter the grade for student %d: ", i+1);
            int num = input.nextInt();
            while ((num > 100) || (num < 0)){
                System.out.println("Error, please input a number between 0 - 100");
                System.out.printf("Enter the grade for student %d: ", i+1);
                num = input.nextInt();
            }  
        grades[i] = num;
        }
    double average;
    average = 0;

    for (int i = 0; i < grades.length; i++) {
        average += grades[i];
    }
    DecimalFormat formatGrade = new DecimalFormat("##.00");
    System.out.println("The class average is: " + formatGrade.format(average));

    Arrays.sort(grades);
    System.out.println("The min grade is: " + grades[0]);
    System.out.println("The max grade is: " + grades[grades.length - 1]);
    }

    public static void main(String[] args) {
        PrintGrade();
    }
}