import java.util.Scanner

public class SDfinder {
    public static void main(string[] args) {
        int numArray[] = new int[10]
        Scanner arrayInput = new Scanner(System.in);

        double mean;
        double standardDev;
        //for loop to get multiple inputs up to array length
        for(int i=0; i<numArray.length; i++) {
            System.out.println("Please input an integer value: ");
            while(numArray.hasNextInt()) {
                int num;
                num = arrayInput.nextInt();

                numArray[i] = num;
                break;
            }
        }
        int sum;
        int sumSq;
        for(int number : numArray) {
            sum += number;
        }
        mean = sum/numArray.length;

        for(double number2 : numArray) {
            standardDev += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDev/numArray.length);
    }
}