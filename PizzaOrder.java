import java.util.Scanner;

public class Main{
  public static void main(String[] arg){
    Scanner input = new Scanner(System.in);
    System.out.print("How many pizzas do you want to order? ");
    int n = input.nextInt();
    Pizza[] a = new Pizza[n];
    input.nextLine();
  for (int i = 0; i < n; i++){
    System.out.println("Choose your pizza's type (cheese, pepperoni, vegetable)? ");
    String t = input.nextLine();
    System.out.println("Choose your pizza's size (small, medium, or large)? ");
    String s = input.nextLine();
    Pizza pizza = new Pizza(t, s);
    a[i] = pizza;
  }

  double total = 0;
  for (int j = 0; j < a.length; j++){
    double price = a[j].price();
    if (price == 0){
      System.out.println("The system cannot read your order. Please try again!");
      break;
    }
    total += price;
  }
  double tax = total * 1.10;
  System.out.printf("You will pay $%1.2f\n",  tax);
  }
}
