import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    System.out.print("Enter the string: ");
    String s = input.nextLine();
    System.out.print("Enter the character: ");
    char c = input.next().charAt(0);
    System.out.println("The total number of character " + c +" in " + s + " is " + count(s,c));
  }
  public static int count(String str, char a) {
    int count = 0;
    for (int number = 0; number < str.length(); number++) {
      if (str.charAt(number) == a) count++;
    }
    return count;
  }
}
