public class App {

   public static void main(String args[]) {

      Roster nickRoster = new Roster();
      Roster daveRoster = new Roster(41);


      String[] players = {"Adam", "Bill", "Charlie", "Dan", "Eric", "Fred", "Greg", "Harry", "Ike", "John", "Kelly"};
      int count = 0;
      while (daveRoster.hasOpenSlots()) {
          daveRoster.addPlayer(players[count]);
          if(count < players.length - 1) {
              count++;
          }
          else {
              count = 0;
          }
      }

      System.out.println(daveRoster);



   }

}
