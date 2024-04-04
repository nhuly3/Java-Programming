import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while(true) {
      System.out.print("Enter how many numbers in the array: ");
      int l = input.nextInt();
      System.out.print("Enter numbers in the array: ");
      double[] a = new double[l];
      for (int i = 0; i < l; i++){
        double number = input.nextDouble();
        a[i] = number;
        }
      System.out.print("Specified number ");
      double s = input.nextDouble();
      System.out.println("Pairs of elements and their sum :");
      p(a, s);
    }
  }
  public static void p(double[] a, double s) {
    for(int j = 0; j < a.length; j++) {
      for(int k = j+1; k<a.length; k++) {
        if(a[j]+a[k] == s) {
          System.out.println(a[j] + " + " + a[k] + " = " + s);
        }
      }
    }
  }
}
