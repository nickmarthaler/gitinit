import java.util.Random;

public class App {

   public static void main(String args[]) {

      Roster nickRoster = new Roster();
      Roster daveRoster = new Roster (3);


      String[] players = {"Adam", "Bill", "Charlie", "Dan", "Eric", "Fred", "Greg", "Harry", "Ike", "John", "Kelly"};
      int count = 0;
      boolean playerWasAdded = true;
      while (playerWasAdded) {
          playerWasAdded = daveRoster.addPlayer(players[count]);
          if(count < players.length - 1) {
              //count++;
              Random r = new Random();
              count = r.nextInt(11);
          }
          else {
              count = 0;
          }
      }

      System.out.println(daveRoster);



   }

}
