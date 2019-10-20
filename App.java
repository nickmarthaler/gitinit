import java.util.Date;


public class App {

   public static void main(String args[]) {
      Date now = new Date();
      System.out.println("Goodbye World -- it is " + now.toString());
      int i = 2;
      i = addTwo(i);
      i = addTwo(i);
      System.out.println("i is equal to " + i);
   }

   private static int addTwo(int i) {
      return i + 2;


   }









}
