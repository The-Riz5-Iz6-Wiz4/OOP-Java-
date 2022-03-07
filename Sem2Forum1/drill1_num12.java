 public class drill1_12 {
     public static void main(String[] args){
         System.out.printf("\tNumber\tSquare\tCubed\t");

         public static int squared(int num){
            return Math.pow(num, 2);
        }
         public static int cubed(int num){
            return Math.pow(num, 3);
        }

         for (int i=0; i<=10; i++){
             System.out.println(String.format("\t%d\t%d\t%d\t", i, squared(i), cubed(i)));
         }
     }
 }