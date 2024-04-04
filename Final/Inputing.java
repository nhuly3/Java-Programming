import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input an interger: ");
    int i, j, sum = 0;
    i = input.nextInt();
    while(i > 0){
      j = i%10;
      sum = sum + j;
      i = i/10;
    }
    System.out.print("The sum is: " + sum);
  }
}
