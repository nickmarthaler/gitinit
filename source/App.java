public class App {

   public static void main(String args[]) {
      Number myNumberObject;
      myNumberObject = new Number();
      Number myOtherNumberObject;
      myOtherNumberObject = new Number();
      myNumberObject.internalNumber = 20;
      myOtherNumberObject.internalNumber = 50;
      myNumberObject.add(8);
      myNumberObject.add(9);
      myOtherNumberObject.add(45);
      myNumberObject.add(-22);
      myNumberObject.add(4);

      System.out.println("my number object is equal to " + myNumberObject.internalNumber);
      System.out.println("my number other object is equal to " + myOtherNumberObject.internalNumber);
   }

   private static int add(int i, int j) {
       return i + j;


   }


   private static int add(int i, int j, int k) {
       return i + j + k;


   }








}
