public class drill1_11{
    public static void main(String[] args){
        int a = 12;
        int b = 33;
        System.out.println("The original values of a and b are " + a + "and " + b + "respectively");

        int c = b;
        b = a ;
        a = c;

        System.out.println("The swapped values of a and b are " + a + "and " + b + "respectively");
    }
}