import java.util.Date;


public class App {

   public static void main(String args[]) {
      Date now = new Date();
      System.out.println("Goodbye World -- it is " + now.toString());
      int t = 2;
      int u = 3;
      int v = 4;
      int sum = add(t,u,v);
      System.out.println("i + j is equal to " + sum);
   }

   private static int add(int i, int j) {
       return i + j;


   }


   private static int add(int i, int j, int k) {
       return i + j + k;


   }








}
