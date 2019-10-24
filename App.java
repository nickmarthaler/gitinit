import java.util.Date;


public class App {

   public static void main(String args[]) {
      Number myNumberObject = new Number();
      myNumberObject.internalNumber = 20;

      int sum = add(myNumberObject.internalNumber,3,6);
      System.out.println("i + j is equal to " + sum);
   }

   private static int add(int i, int j) {
       return i + j;


   }


   private static int add(int i, int j, int k) {
       return i + j + k;


   }








}
