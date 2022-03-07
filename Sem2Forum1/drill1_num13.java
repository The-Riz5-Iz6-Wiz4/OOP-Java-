import java.util.Scanner;

 public class drill1_13 {
    public static void main(String[] args){
        Scanner aInput = new Scanner(System.in);
        Scanner bInput = new Scanner(System.in);
        Scanner cInput = new Scanner(System.in);

        while (true){
            System.out.println("Enter the values a, b and c in order to be used in calculations: ");
            double a = aInput.nextDouble();
            double b = bInput.nextDouble();
            double c = cInput.nextDouble();

          if(a == 0){
              System.out.println("Math error! Value of a cannot be 0 since you can't divide by 0")
          } else if (a != 0) {
              //(-b +- (b^2 - 4ac)^(1/2))/2a
              double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
              double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
              System.out.println("The solutions for the 2nd grade polynomial are" + x1 + "and" + x2);
              break;
          } else {
              System.out.println("Not a number or incorrect input.");
          }          
        }
    }
 }