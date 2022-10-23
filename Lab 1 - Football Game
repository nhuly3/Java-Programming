import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int team;
    int quantity;
    int needed;
    int eliminated;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of players:  ");
    int players = input.nextInt();
    System.out.println("Select a sport team: ");
    System.out.println("1 - NFL");
    System.out.println("2 - NBA");
    System.out.println("3 - MLB");
    System.out.println("4 - NHL");
    System.out.print("Select 1-4 : ");
    int select = input.nextInt();
    if (select == 1)
       quantity = 53;
    else if (select == 2)
       quantity = 13;
    else if (select == 3)
       quantity = 25;
    else 
       quantity = 23;

    if (players < quantity)  {
      System.out.println("There are not enough players.");
      needed =  quantity - players;
      System.out.println(needed + " more players are needed.");
    }  
    else if (players > quantity)  {
      System.out.println("There are too many players.");
      eliminated = players - quantity;
      System.out.println(eliminated + " players need to be eliminated."); 
    }
    else {
      System.out.println("The number of players has just right");
    }
  }
}
